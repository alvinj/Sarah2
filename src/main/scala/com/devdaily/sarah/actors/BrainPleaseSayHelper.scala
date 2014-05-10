package com.devdaily.sarah.actors

import akka.actor._
import com.devdaily.sarah.plugins.PleaseSay
import grizzled.slf4j.Logging

/**
 * A class to offload "PleaseSay" requests from the Brain.
 */
class BrainPleaseSayHelper(mouth: ActorRef)
extends Actor
with Logging
{

  def receive = {
//    case pleaseSay: PleaseSay =>
//         log.info(format("got a please-say request (%s) at (%d)", pleaseSay.textToSay, System.currentTimeMillis))
//         handlePleaseSayRequest(pleaseSay)

    case unknown => 
         logger.info(format("got an unknown request(%s), ignoring it", unknown.toString))
  }
  
}

