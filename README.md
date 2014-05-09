Sarah Project README File
=========================

To-Do
-----

I need to document the "Accessibility" stuff in Mac OS X 10.9
(under "Security & Privacy).

For Developers
--------------

Several classes in this project are currently a bit of a mess due to many
changes over the last 2-3 days (and a forced schedule). As soon as I get 
back to working on SARAH again, the first thing I'll do is clean up 
classes like Sarah.scala and Brain.scala, which are probably in the worst 
shape.


Introduction
------------

This is the README file for the alvinalexander.com project named Sarah,
which is named after the house/computer SARAH in the tv show Eureka.

This project is an attempt to build a software tool that:

   * You can communicate with using speech recognition.
   * Can communicate with you using computer voices (text to voice).
   * Executes commands you want run in real time.
   * Runs other processes/threads/agents that can report to you on a schedule,
     or when certain events occur.

Note: I'm mainly pushing this project out here today (November 20, 2011)
      because I need to work on some other things for a little while.
      The project isn't really ready to be shared with the public yet, but
      I'm hoping that by putting it out here, other people might find it
      (and like it), and it will also put pressure on me to keep working on
      it and improving it.

Demo
----

You can see a demo of Sarah on YouTube here:

  http://www.youtube.com/watch?v=CwMFLkp4dyc

You can also see a demo of my semi-related software robot code on 
YouTube here:

  http://www.youtube.com/watch?v=pfhLdc64cek

As you can imagine, these two projects might connect at some point in
the future.

Source Code
-----------

I originally wrote this application in Java, and recently I've started
porting it over to Scala. As a result, you'll find a mix of code in the
project. As usual, it needs to be cleaned up, but I'm also trying to 
decide how I want to arrange it. I'd like to create a plugin architecture
similar to what is used in tools like Eclipse, Drupal, or Nagios (bare
minimum architecture, and everything is a plugin).


Running Sarah
-------------

If you know how to use Scala and sbt, you can run Sarah from the root
project directory like this:

	sbt run

If you don't know how to use those tools, sorry, I don't have any 
documentation here to help you at this time.

Thanks
------

This project is built on the excellent speach recognition work of the
CMU Sphinx4 project:

http://cmusphinx.sourceforge.net/sphinx4

I have nothing to do with their work, other than being a fan of their
project, and being very interested in human/computer interaction via
voice/speech, and robotics.

More Information
----------------

Sarah was created by Alvin Alexander of http://alvinalexander.com

See http://alvinalexander.com/sarah for more information.




