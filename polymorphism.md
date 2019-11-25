### 

- The Java virtual machine automatically executes the correct version of the method, depending on the type of object to which e refers

- If e refers to a Manager object, then the Manager version of the getSalary method is invoked.

- Recall that this phenomenon is called polymorphism

---

- The call to the superclass constructor must be the first statement of the subclass constructor
- If all superclass constructors require parameters, then the subclass must call super or the compiler reports an error.
