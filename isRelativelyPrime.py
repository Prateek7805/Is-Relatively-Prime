def GCD(divisor,dividend):
    rem = dividend%divisor
    if(rem == 0):
        return divisor
    return GCD(rem, divisor)

def relativelyPrime(a, b):
    if a>b:
        a,b = b,a
    return GCD(a,b) == 1
if __name__ == "__main__":
    a,b = map(int, input("Enter 2 numbers: ").split())
    if(relativelyPrime(a,b)):
        print(True)
    else:
        print(False)