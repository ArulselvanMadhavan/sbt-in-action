# sbt-in-action
Learning SBT

# Notes
### Chapter-3 Core Concepts
3 main parts of sbt configuration
1. Settings
2. Tasks - A task is like a setting that runs everytime you request its value.
3. Project 

### SBT Definition
1. A variable or method for reuse within sbt settings.
2. Compiled first and can reference previous definitions.
3. Always use the = operator
4. Definitions create a slot where computed build values can go. A setting usually fills the slot by compluting the value and putting it in the slot.

### Configurations
Configurations are namespaces for keys. 

Default Configurations - Compile, Test, Runtime, IntegrationTest
