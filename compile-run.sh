#!/bin/sh

# ---
# SBT
# ---

sbt compile

if [ $? != 0 ]
then
  echo "Compile failed, exiting"
  exit 1
fi

# ---
# ANT
# ---

cd custom
ant

if [ $? != 0 ]
then
  echo "Ant failed, exiting"
  exit 2
fi

sleep 1

# ---
# RUN
# ---

open release/Sarah.app


