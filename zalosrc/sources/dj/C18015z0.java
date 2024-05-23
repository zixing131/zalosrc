package dj;

import android.text.TextUtils;
import com.zing.zalo.control.RichTextFormat;
import com.zing.zalo.control.TextStyle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: dj.z0 */
/* loaded from: classes3.dex */
public class C18015z0 extends C17969i0 {

    /* renamed from: B */
    public List f91255B;

    /* renamed from: C */
    int f91256C;

    public C18015z0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91256C = 0;
        m95800h();
    }

    /* renamed from: i */
    private void m95798i(List list) {
        int i11;
        Iterator it = list.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            RichTextFormat richTextFormat = (RichTextFormat) it.next();
            TextStyle m40649e = richTextFormat.m40649e();
            if (m40649e != null) {
                if (i12 != 0) {
                    int m40650f = richTextFormat.m40650f() - i13;
                    i11 = 1;
                    if (m40650f > 1) {
                        m40649e.m40661g(1);
                        int i14 = i11;
                        i13 = richTextFormat.m40648d();
                        i12 = i14;
                    }
                }
                i11 = i12 + 1;
                m40649e.m40661g(i11);
                int i142 = i11;
                i13 = richTextFormat.m40648d();
                i12 = i142;
            }
        }
    }

    /* renamed from: g */
    public boolean m95799g() {
        List list = this.f91255B;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m95800h() {
        try {
            if (TextUtils.equals(this.f91016u, "rtf") && !TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                this.f91256C = jSONObject.optInt("ver");
                JSONArray optJSONArray = jSONObject.optJSONArray("styles");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    this.f91255B = new LinkedList();
                    for (int i11 = 0; i11 < length; i11++) {
                        RichTextFormat m40644g = RichTextFormat.m40644g(optJSONArray.getJSONObject(i11));
                        if (m40644g != null) {
                            this.f91255B.add(m40644g);
                            m95798i(this.f91255B);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C18015z0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91256C = 0;
        m95800h();
    }
}
