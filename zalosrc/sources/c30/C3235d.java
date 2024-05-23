package c30;

import android.text.TextUtils;
import c30.C3250k0;
import fi.C18953k;
import gi.EnumC19448a;
import gi.EnumC19450c;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p683yj.C30997b;
import p716zh.C31917f9;

/* renamed from: c30.d */
/* loaded from: classes5.dex */
public class C3235d extends Thread {

    /* renamed from: p */
    private final String f13811p;

    /* renamed from: q */
    private final List f13812q;

    /* renamed from: r */
    private final C3250k0.a f13813r;

    /* renamed from: s */
    private final b f13814s;

    /* renamed from: t */
    private final C18953k.c f13815t;

    /* renamed from: u */
    private int f13816u;

    /* renamed from: v */
    private final C18953k f13817v;

    /* renamed from: w */
    private final boolean f13818w;

    /* renamed from: x */
    private final C30997b.c f13819x;

    /* renamed from: c30.d$a */
    /* loaded from: classes5.dex */
    class a implements C18953k.c {
        a() {
        }

        @Override // fi.C18953k.c
        /* renamed from: a */
        public void mo16434a(EnumC19450c enumC19450c, C30997b c30997b, C31917f9 c31917f9) {
            C3235d.this.f13814s.mo16436a(enumC19450c, c31917f9, c30997b);
        }

        @Override // fi.C18953k.c
        /* renamed from: b */
        public void mo16435b(EnumC19448a enumC19448a, String str) {
            C3235d.this.m16433c();
        }
    }

    /* renamed from: c30.d$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo16436a(EnumC19450c enumC19450c, C31917f9 c31917f9, C30997b c30997b);
    }

    public C3235d(C18953k c18953k, String str, C3250k0.a aVar, List list, boolean z11, C30997b.c cVar, b bVar) {
        super("Z:GetLastSuggestKwdTask");
        this.f13817v = c18953k;
        this.f13811p = str;
        this.f13812q = list;
        this.f13814s = bVar;
        this.f13816u = -1;
        this.f13813r = aVar;
        this.f13818w = z11;
        this.f13819x = cVar;
        this.f13815t = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m16433c() {
        C3250k0.a aVar;
        int i11 = this.f13816u - 1;
        this.f13816u = i11;
        if (i11 >= 0 && i11 < this.f13812q.size()) {
            C3250k0.a aVar2 = (C3250k0.a) this.f13812q.get(this.f13816u);
            Matcher matcher = Pattern.compile("(^|\\s+|.*\\s+)" + Pattern.quote(aVar2.f13909b) + "(\\s+|$|\\s+.*)").matcher(this.f13811p);
            int i12 = aVar2.f13908a;
            if (i12 >= 0 && i12 <= this.f13811p.length()) {
                int i13 = aVar2.f13908a;
                if (i13 > 0) {
                    i13--;
                }
                if (matcher.find(i13) && ((aVar = this.f13813r) == null || !TextUtils.equals(aVar.f13910c.m150661e(), aVar2.f13910c.m150661e()))) {
                    if (aVar2.f13910c.m150665i()) {
                        this.f13817v.m99400c0(EnumC19450c.f96557t, aVar2.f13910c, this.f13818w, this.f13819x, this.f13815t);
                        return;
                    }
                    return;
                }
            }
            m16433c();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f13816u = this.f13812q.size();
        m16433c();
    }
}
