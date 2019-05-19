# Java 基礎

> ### 小觀念

* 變數private, 再用公有的方法, 是防止輸入錯誤
* 型別跟類別降轉人工做
* 變數名稱第一個字小寫, 後面大寫
* 類別名稱第一個字大寫
* 參考型別第一個字大寫
* 實質型別第一個字小寫
* 常數全大寫
* 變數是用stack儲存
* 區域變數是方法呼叫出來之後才配置記憶體空間
* 類別名稱需與檔名相同

**基本輸出**

{% api-method method="get" host="" path="" %}
{% api-method-summary %}
www.google.com
{% endapi-method-summary %}

{% api-method-description %}

{% endapi-method-description %}

{% api-method-spec %}
{% api-method-request %}
{% api-method-path-parameters %}
{% api-method-parameter name="" type="string" required=false %}
aaa
{% endapi-method-parameter %}
{% endapi-method-path-parameters %}
{% endapi-method-request %}

{% api-method-response %}
{% api-method-response-example httpCode=200 %}
{% api-method-response-example-description %}

{% endapi-method-response-example-description %}

```

```
{% endapi-method-response-example %}
{% endapi-method-response %}
{% endapi-method-spec %}
{% endapi-method %}

```java
System.out.println("He"+"\n"); // 裡面放String, 裡面換行用\n
System.out.println("Hello!"); // print結束不會換行, 裡面換行用 \n
System.out.printf("$d",44); // printf當作C程式 %d是印出數字 %n換行
System.out.printf("%s","嘿嘿"); // %s印出字串
System.out.printf("%c","A"); // %c印出字元 
```

\*\*\*\*

**類別繼承**​

| 當前 | 同package | 子孫類 | 其他package |
| :--- | :--- | :--- | :--- |
| public | V | V | V |
| protected | V | V | V |
| friendly | V | V | X |
| private | V | X | X |



**宣告**

```text
public static void main(String[] args){
    // 程式進入點
}
```

**陣列**

```text
int[] a1,a2; int a1[],a2;
int[] a1 = int[3]{1,2,3}
```

**格式化**

```text
DecimalFormat gg = new DecimalFormat("0.00");
gg.format(amt);
```

### class內

**實例化**

 Snoopy sn1 = new Snoopy\(\); //用預設, 屬性自己建 ​ Snoopy sn2 = new Snoopy\(/_元素1_/,/_元素2_/\)

**套件**

```text
import javax.swing.JOptionPane; // 視窗套件
import javax.swing.JFrame
```

**設定UI**

```text
Container c = getContentPane();
c.setLayout(new FlowLayout()); // 置中
secondDie = new JTextField( 10 );
secondDie.setEditable( false );     //Visible
​
roll = new JButton( "Roll Dice" );  //建按鈕
roll.addActionListener( this );     //觸發事件
​
JButton
JTextField
JTextArea outputArea = new JTextArea( 17,20 ); //17為y軸,20為x軸
JScrollPane scroller = new JScrollPane( outputArea );
win.setSize(200,300) //物件的方法為實體方法
Integer.parseInt("543") //屬性的方法為靜態方法
```

**亂數**

Math.random\(\)\*6 //會取0~6的double亂數, 要加以格式化 Math.row\(\) // Math.sqrt\(\) //

```text
int point = (int)(Math.random()*6)+1
​
firstDieset.Editable(false); //反白
secondDie = new JTextField(10); //
(int)(Math.row()*6) //0到5.999取整數
public int rollDice(){ return workSum;}
Integer.parseInt(100) //轉型整數
Integer.toString(100) //轉型字
String.valueOf(100); //裡面放int,double,bool...等等都可
Double.valueOF
this.setTitle(s) //設標題字樣
setText() //TextBox顯示
​
public void actionPerformed(ActionEvent e){
    play();
}
```

**建構子在視窗內加一個JLabel**

```text
javax.swing.JFrame // windows 視窗要 extends JFrame
javax.swing.JLabel
java.awt.Container
setSize(width,height);
setLocationRelative(null); //null在中央
setVisible(true);
​
JLabel (String text, center);
JComponent.setFont( Font  font);
```

**顯示MessageBox**

JOptionPane.showMessageDialog\(副視窗是否置中,""\);

