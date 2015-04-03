package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import com.nappin.play.recaptcha.RecaptchaVerifier
import models.RegistrationForm

object Registration extends Controller {

  val log: Logger = Logger(this.getClass)

  val recaptchaVerifier = new RecaptchaVerifier()

  val registrationForm = Form(mapping(
    "firstName" -> nonEmptyText,
    "lastName" -> nonEmptyText,
    "email" -> email,
    "phone" -> nonEmptyText)(RegistrationForm.apply)(RegistrationForm.unapply))

  def show = Action { implicit request =>
    Ok(views.html.index(registrationForm))
  }

  def register = Action.async { implicit request =>
    implicit val context = scala.concurrent.ExecutionContext.Implicits.global

    recaptchaVerifier.bindFromRequestAndVerify(registrationForm).map { form =>
      form.fold(
        errors => {
          BadRequest(views.html.index(errors))
        },
        success => {
          val saveMessage = "User " + success.firstName + " has been registered"
          Redirect(routes.Registration.result).flashing("save.message" -> saveMessage)
        })
    }

  }

  def result = Action { implicit request =>
    Ok(views.html.result())
  }

}