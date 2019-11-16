The Abstract Factory design pattern solves problems like: 

- How can an application be independent of how its objects are created?
- How can a class be independent of how the objects it requires are created?
- How can families of related or dependent objects be created?

The Abstract Factory design pattern describes how to solve such problems:

- Encapsulate object creation in a separate (factory) object. That is, define an interface (AbstractFactory) for creating objects, and implement the interface.
- A class delegates object creation to a factory object instead of creating objects directly.

This makes a class independent of how its objects are created (which concrete classes are instantiated). A class can be configured with a factory object, which it uses to create objects, and even more, the factory object can be exchanged at run-time.



Wikipedia example:

It should render a button in either a Windows style or Mac OS X style depending on which kind of factory was used. Note that the Application has no idea what kind of `GUIFactory` it is given or even what kind of `Button `that factory creates.

```
interface Button is
  method paint()

interface GUIFactory is
  method createButton()
      output:  a button

class WinFactory implementing GUIFactory is
  method createButton() is
      output:  a Windows button
    Return a new WinButton

class OSXFactory implementing GUIFactory is
  method createButton() is
      output:  an OS X button
    Return a new OSXButton

class WinButton implementing Button is
  method paint() is
    Render a button in a Windows style

class OSXButton implementing Button is
  method paint() is
    Render a button in a Mac OS X style

class Application is
  constructor Application(factory) is
      input:  the GUIFactory factory used to create buttons
    Button button := factory.createButton()
    button.paint()

Read the configuration file
If the OS specified in the configuration file is Windows, then
  Construct a WinFactory
  Construct an Application with WinFactory
else
  Construct an OSXFactory
  Construct an Application with OSXFactory
```