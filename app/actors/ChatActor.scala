package actors

import akka.actor.{Actor, ActorRef, Props}

class ChatActor(out: ActorRef, manager: ActorRef) extends Actor {
  import ChatActor._
  manager ! ChatManager.NewChatter(self)

  def receive: Receive = {
    case s: String =>manager ! ChatManager.Message(s)
    case SendMessage(msg)=> out ! msg
    case m => println("Unhandled message in ChatActor: " + m)
  }
}
object ChatActor{
  def props(out: ActorRef, manager: ActorRef)=Props(new ChatActor(out, manager))
  case class SendMessage(msg:String)
}