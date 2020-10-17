def fibonacci(num:Int):Int=
{
    if(num<2)
    {
        return num
    }
        else
    {
        return (fibonacci(num-2)+fibonacci(num-1))
    }
    
}
/* The result is
scala> fibonacci(13)
res1: Int = 233 */

