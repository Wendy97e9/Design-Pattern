package deepCopy;

//import java.io.Serializable;
import java.io.*;

public class Email implements Serializable {
	
	// private static final long seriaVersionUID = -8099797912131114211L;
	
	private Attachment attachment = null;
	
	public Email()
	{
		this.attachment = new Attachment();
	}
	
	public Object deepClone() throws Exception
	{
		// 将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
	}

	public void display()
	{
		System.out.println("Email："+this.hashCode());
		System.out.println("附件："+attachment.hashCode());
		attachment.download();
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(deepCopy.Attachment attachment2) {
		this.attachment = attachment2;
	}
}
