package �ַ���;
class  StrDemo
{
 public static void main(String[] args) 
 {
  StringBuffer u=new StringBuffer("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ�����������С����� ");//�����ַ���1
  StringBuffer u1=new StringBuffer("��");//�����ַ���2
  for (int i = 7;i<u.length();i+=8) {
         u.insert(i, "��");
             }
        for (int a = 15;a<u.length();a+=15) {
         u.deleteCharAt(a);
             }
         for (int b = 15;b<u.length();b+=16) {
             u.insert(b, "��");
             }
         for (int c = 16;c<u.length();c+=17) {
             u.insert(c, "\n");
             }
     System.out.println(u);
  boolean b=u.toString().contains(u1);//���ַ����Ƿ񱻰����ڴ��ַ���֮��,�������true���������false
  System.out.println("�˶��Ƿ��������������:"+b);
  System.out.println("��������Ϊ��"+count(u.toString(),u1.toString()));//����count�������������
 }
  //ͳ�����ַ�������������
 static int count(String s1,String s2)
 {
  int c=0;
  int index=-1;
  while((index=s1.indexOf(s2,index))>-1)//indexOf����һ���ַ����ַ����ĵ�һ�γ���
  {
   index+=7;
   c++;

  }
  return c;
 }
}
//�жϳ����Ƿ�Ϸ����쳣
public class LengthException extends Exception {
  public LengthException() {}
  public LengthException(String s) {
      super(s);
  }
  @Override
  public String getMessage() {
      return super.getMessage();
  }
}