# Comments

## Unclean Comments

```java
private void ValidateProductSale(int productStatus)
{
    // status 3 run out and status 4 inactive
    if(productStatus == 3 || productStatus == 4)
    {
        throw new Exception("The product can't be purchased");
    }
}
```

### Redundant

```java
    // class Person
	public class Person {
        // Person's name
        private String Name;
        // Person's age
        private int Age;
    }
```

### Historical comments

Use version control instead

```java
// <summary>
//22-01-24: Create basic structure
//23-01-24: Add more code
//24-01-24: Correct a bug
// <summary>
```

## Clean Comments

```java
public enum ProductStatus 
{
    Available = 1,
    RunOut = 3,
    Inactive = 4;
}

private void ValidateProductSale(int productStatus)
{
    if(productStatus == ProductStatus.RunOut || productStatus == ProductStatus.Inactive)
    {
        throw new Exception("The product can't be purchased");
    }
}
```

### Copyright, year, licences

```java
// Copyright 2024 ITAcademy

/*
* Licensed under the Apache License, Version 2.0; 
* you may not use this file except in compliance with the License.
*/
```

### Informative

```java
// E.g: 1-809-568-2222 (the first 1 is optional)
String RegexTelefon = @”^[(1- )?\d{3}-\d¨{3}-\d{4} $”;
```

!! Be careful because an informative comment it could transform into an obsolet comment if only the code is modified. It could cause confusion whereas it's the comment which is wrong or the code is.  

```java
// E.g: 1-809-568-2222 (the first 1 is optional)
String RegexTelefon = @”^[(1- )\d{3}-\d¨{3}-\d{4} $”;
```

### Explain intentions

```java
// Convert errors into a list of strings to simply the code of frontend
private static List<String>;
convertErrorsIntoList(ActionExecutedContext context)
```

```java
// Require admin permissions to function
// If not admin -> error
private void DeleteFile(String path)
```

### To-Do 

```java
private void ValidateProductSale(int productStatus)
{
    // TO-DO: Refactor with enum's
    // status 3 run out and status 4 inactive
    if(productStatus == 3 || productStatus == 4)
    {
        throw new Exception("The product can't be purchased");
    }
}
```