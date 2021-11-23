// Caeser为第三方类，无法继承，只有.class文件，所以只可以使用对象适配器

package objectAdapter;

public final class Caeser {
	
	public String doEncrypt(int key, String ps)
	{
		String es = "";
		for(int i = 0; i < ps.length(); i++)
		{
			char c = ps.charAt(i);
			if (c >= 'a' && c <= 'z')
			{
				c += key % 26;
				if (c > 'z')
					c -= 26;
				if (c < 'a')
					c += 26;
			}
			if (c >= 'A' && c <= 'Z')
			{
				c += key % 26;
				if (c > 'Z')
					c -= 26;
				if (c < 'A')
					c += 26;
			}
			es += c;
		}
		return es;
	}

}
