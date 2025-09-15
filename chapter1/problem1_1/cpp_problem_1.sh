#!/bin/bash

g++ problem1_1.cpp -o problem1_1_compiled 

if [ $? -eq 0 ]; then
    ./problem1_1_compiled "$1"
    rm problem1_1_compiled
else
  echo "Compilation failed."
fi
