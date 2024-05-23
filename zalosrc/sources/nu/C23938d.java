package nu;

import java.util.ArrayList;

/* renamed from: nu.d */
/* loaded from: classes4.dex */
public class C23938d {

    /* renamed from: a */
    public C23936b f115869a = null;

    /* renamed from: b */
    public C23940f f115870b = null;

    /* renamed from: c */
    public C23945k f115871c = null;

    /* renamed from: d */
    public C23941g f115872d = null;

    /* renamed from: e */
    public C23935a f115873e = null;

    /* renamed from: f */
    public int f115874f = -1;

    /* renamed from: g */
    public int f115875g = -1;

    /* renamed from: i */
    public long f115877i = 0;

    /* renamed from: j */
    public long f115878j = 0;

    /* renamed from: k */
    public ArrayList f115879k = new ArrayList();

    /* renamed from: h */
    public String f115876h = "";

    /* renamed from: l */
    public String f115880l = "";

    /* renamed from: m */
    public String f115881m = "";

    /* renamed from: a */
    public boolean m125307a(String str, C23943i c23943i) {
        int i11;
        if (this.f115879k.size() > 0) {
            i11 = this.f115879k.size() - 1;
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            return true;
        }
        return c23943i.mo125304f(str.substring(((C23943i) this.f115879k.get(i11)).f115909e, c23943i.f115908d));
    }
}
