#!/bin/bash

# If running locally we don't need to step into the directory
if [ $# -eq 0 ]
  then
    pushd searchcode-server 2> /dev/null || true
fi

mvn test