package com.tuto.HelloServlet
 
import javax.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSRes}
import javax.servlet.annotation.WebServlet
 
@WebServlet(Array("/"))
class HelloScalaServlet extends HttpServlet {
  def message =
    <HTML>
      <HEAD><TITLE>Hello, Scala!</TITLE></HEAD>
      <BODY>Hello, Scala! It's now { currentDate }</BODY>
    </HTML>
  def currentDate = java.util.Calendar.getInstance().getTime()

  override def doGet(req : HSReq, resp : HSRes) =
    resp.getWriter().print(message)
}