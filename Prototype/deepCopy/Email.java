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
		// ������д������
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // �����������ȡ��
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
	}

	public void display()
	{
		System.out.println("Email��"+this.hashCode());
		System.out.println("������"+attachment.hashCode());
		attachment.download();
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(deepCopy.Attachment attachment2) {
		this.attachment = attachment2;
	}
}
