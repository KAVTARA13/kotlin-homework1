//დავალება 1
//დაწერეთ ფუნქცია, რომელიც პარამეტრად მიიღებს მთელი რიცხვების მასივს და დააბრუნებს
//მთელ მნიშვნელობას.ფუნქციამ უნდა გამოთვალოს მასივში ლუწ ინდექსზე მდგომი რიცხვების
//საშუალო არითმეტიკული.
//მოიყვანეთ ფუნქციის გამოყენების მაგალითი.
fun averageEvenIndexNumbers(numbers: IntArray):Int{
    var index = 1;
    var sum = 0;
    var number = 0;
    while (index<numbers.size){
        if(index%2==0){
            sum+=numbers[index];
            number++;
        }
        index++;
    }
    return sum/number;
}

//დავალება 2
//დაწერეთ ფუნქცია, რომელსაც გადაეცემა String ტიპის პარამეტრი და დააბრუნებს Boolean
//მნიშვნელობას.ფუნქციამ უნდა დააბრუნოს true, თუ გადმოცემული String მნიშვნელობა
//პალინდრომია, წინააღმდეგ შემთხვევაში false.
//(პალინდრომი— სიტყვა, ფრაზა ან ლექსი, რომელიც წაღმა და უკუღმა ერთნაირად იკითხება)
fun checkPalindrome(text: String): Boolean{
    var newText = ""
    for (i in text.lowercase()){
        if(i in 'a'..'z'){
            newText+=i
        }
    }
    var index = 0;
    var palindrome = true;
    while (index < newText.length/2){
        if (newText[index] == newText[newText.length-index-1]){
            index++
            continue
        }else{
            palindrome =  false
            break
        }
    }
    return palindrome
}

fun main(){
    println(averageEvenIndexNumbers(intArrayOf(10, 20, 40, 40, 50, 80)))
//    !!პალინდრომზე სიმბოლოები არ უნდა გავითვალისწინოთ როგორც ვნახე.
    println(checkPalindrome("anna"))
}