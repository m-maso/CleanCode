# Functions / Methods

## Unclean Functions / Methods

```java
double a = getAnswer(2,3);

double getAnswer(double c, double a) 
{
    return c * a / 2;
}
```

```java
private void validatePassword(String password)
{
    if(password.length() < 8)
    {
        throw new Exception("Password is too short");
    }
}
```

### Horizontal scroll 

```java
public static void typeItemsOrdered(List<NPC> sellers, String type){
		
		List<Item> itemsType = sellers.stream().flatMap(s->s.getItems().stream()).filter(i->i.getType().equalsIgnoreCase(type)).toList();
		if(!itemsType.isEmpty()) 
        {
			sellers.stream().flatMap(s->s.getItems().stream()).sorted(Comparator.comparingDouble(Item::getPrice)).filter(i->i.getType().equalsIgnoreCase(type)).forEach(System.out::println);	
		} else 
        {
			System.out.println("This type of item doesn't exist yet");
		}

	}
```

## Clean Functions / Methods

### Clean names

```java
run();
runFast();
getBackground();

int getSum(int firstNum, int secondNum) {
}
```

```java
double triangleArea = calculateTriangleArea(2,3);

double calculateTriangleArea(double base, double height)
{
    return base * height / 2;
}
```

```java
private int minimQuantityOfCharacters = 8;
	private void validatePassword(String password)
	{
		if(password.length() < minimQuantityOfCharacters)
		{
			throw new Exception("Password is too short");
		}
	}
```


### Horizontal scroll 

```java
public static void typeItemsOrdered(List<NPC> sellers, String type){
		
		List<Item> itemsType = sellers.stream().flatMap(s->s.getItems().stream())
				.filter(i->i.getType().equalsIgnoreCase(type))
				.toList();

		if(!itemsType.isEmpty()) 
        {
			sellers.stream().flatMap(s->s.getItems().stream()) 
							.sorted(Comparator.comparingDouble(Item::getPrice))
							.filter(i->i.getType().equalsIgnoreCase(type))
							.forEach(System.out::println);	
		} else 
        {
			System.out.println("This type of item doesn't exist yet");
		}

	}
```
