package p716zh;

import android.text.TextUtils;
import gi.EnumC19449b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zh.f9 */
/* loaded from: classes3.dex */
public class C31917f9 {

    /* renamed from: a */
    public List f146629a;

    /* renamed from: b */
    public EnumC19449b f146630b;

    /* renamed from: c */
    public String f146631c;

    /* renamed from: d */
    public long f146632d;

    /* renamed from: e */
    public long f146633e;

    public C31917f9() {
        this.f146629a = new ArrayList();
        this.f146631c = "";
        this.f146630b = EnumC19449b.f96542q;
        this.f146631c = "";
        this.f146632d = 0L;
        this.f146633e = 0L;
    }

    /* renamed from: a */
    public boolean m153378a() {
        if (this.f146632d > 0 && System.currentTimeMillis() - this.f146632d <= this.f146633e * 1000) {
            return false;
        }
        return true;
    }

    public C31917f9(List list, EnumC19449b enumC19449b) {
        new ArrayList();
        this.f146631c = "";
        this.f146629a = list;
        this.f146630b = enumC19449b;
    }

    public C31917f9(List list, EnumC19449b enumC19449b, long j11, long j12) {
        this(list, enumC19449b);
        this.f146631c = "";
        this.f146632d = j11;
        this.f146633e = j12;
    }

    public C31917f9(List list, EnumC19449b enumC19449b, String str) {
        this(list, enumC19449b);
        this.f146631c = str;
        this.f146632d = 0L;
        this.f146633e = 0L;
    }

    public C31917f9(C31917f9 c31917f9) {
        ArrayList arrayList = new ArrayList();
        this.f146629a = arrayList;
        this.f146631c = "";
        if (c31917f9 != null) {
            arrayList.addAll(c31917f9.f146629a);
            this.f146630b = c31917f9.f146630b;
            this.f146631c = TextUtils.isEmpty(c31917f9.f146631c) ? "" : c31917f9.f146631c;
            this.f146632d = c31917f9.f146632d;
            this.f146633e = c31917f9.f146633e;
        }
    }
}
