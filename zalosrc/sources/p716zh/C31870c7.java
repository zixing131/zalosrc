package p716zh;

import android.text.TextUtils;
import au.AbstractC2368q0;
import java.util.ArrayList;

/* renamed from: zh.c7 */
/* loaded from: classes3.dex */
public class C31870c7 {

    /* renamed from: l */
    public static String f146363l = "All";

    /* renamed from: m */
    public static String f146364m = "@All";

    /* renamed from: a */
    public int f146365a;

    /* renamed from: b */
    public String f146366b;

    /* renamed from: c */
    public String f146367c;

    /* renamed from: d */
    public String f146368d;

    /* renamed from: e */
    public String f146369e;

    /* renamed from: f */
    public String f146370f;

    /* renamed from: g */
    public String f146371g;

    /* renamed from: h */
    public String f146372h;

    /* renamed from: i */
    public boolean f146373i;

    /* renamed from: j */
    private String f146374j = null;

    /* renamed from: k */
    private ArrayList f146375k = null;

    /* renamed from: a */
    public ArrayList m153175a() {
        if (this.f146375k == null) {
            String m153176b = m153176b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            for (int i11 = 1; i11 < m153176b.length(); i11++) {
                if (m153176b.charAt(i11 - 1) == ' ' && m153176b.charAt(i11) != ' ') {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            this.f146375k = arrayList;
        }
        return this.f146375k;
    }

    /* renamed from: b */
    public String m153176b() {
        if (this.f146374j == null) {
            String str = this.f146368d;
            if (!TextUtils.isEmpty(this.f146372h)) {
                str = str + " " + this.f146372h.toLowerCase();
            }
            this.f146374j = AbstractC2368q0.m12391f(str).toLowerCase();
        }
        return this.f146374j;
    }
}
