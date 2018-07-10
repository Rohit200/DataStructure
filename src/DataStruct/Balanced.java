package DataStruct;
public class Balanced
{
	public boolean check(String s1)
	{
		Stack st=new Stack();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
	{
		switch(ch[i])
		{
		case '(':
		case '{':
		case '[':
			st.push(ch[i]);
		break;
		case ')':
			if(st.isEmpty()||(char)st.pop()!='(')
				return false;
			break;
		case '}':
			if(st.isEmpty()||(char)st.pop()!='{')
				return false;
			break;
		case ']':
			if(st.isEmpty()||(char)st.pop()!='[')
				return false;
			break;
	}
	}
		return st.isEmpty();
	}
	}

