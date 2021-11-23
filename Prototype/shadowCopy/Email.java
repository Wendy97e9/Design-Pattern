package shadowCopy;

// 实现了Cloneable接口，浅拷贝，attachment实际上并没有进行复制
public class Email implements Cloneable {
	
	private Attachment attachment;
	
	public Email()
	{
		this.attachment = new Attachment();
	}
	
	public Object clone()
	{
		Email email = null;
		try {
			email = (Email)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return email;
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

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	
	

}
