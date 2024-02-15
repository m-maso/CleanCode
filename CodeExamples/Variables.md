# Variables

## Unclean Variables

```java
int d;
String[] arr;

boolean flag;

final int mwidth = 4;

Date modDateYYMMDD;

String directionString;
```

### Magic Value

We don't know what productStatus 3 or 4 means, recommend to use an enum in this case.

```java
private void ValidateProductSale(int productStatus)
{
    if(productStatus == 3 || productStatus == 4)
    {
        throw new Exception("The product can't be purchased");
    }
}
```


## Clean Variables

```java
int paymentDay;
String[] monthNames;

boolean isCellActivated;
boolean hasAccess;

final int MIN_WIDTH = 4;

Date modificationTimestamp;

String direction;
```

## Use methods instead of static variables to test state

```java
connections[STATUS] = ALIVE;
connection.isAlive()
```

isAlive() returns the connection status and connections[] is an array that contains the status of the connection.