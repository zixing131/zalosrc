package pd0;

import am.C0943w;
import android.content.Intent;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.Random;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import mm0.AbstractC23352g;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24223a;
import od0.InterfaceC24232j;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23994e;
import p379o3.C23995f;
import p716zh.C31973j5;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25735a;
import rd0.C25746l;
import td0.C26638a;
import td0.C26639b;

/* renamed from: pd0.f */
/* loaded from: classes4.dex */
public class C24732f {

    /* renamed from: a */
    public String f118779a;

    /* renamed from: b */
    public final EnumC24734h f118780b;

    /* renamed from: c */
    private InterfaceC24223a f118781c;

    /* renamed from: g */
    public String f118785g;

    /* renamed from: h */
    boolean f118786h;

    /* renamed from: m */
    private C24230h f118791m;

    /* renamed from: d */
    public EnumC24733g f118782d = EnumC24733g.NONE;

    /* renamed from: e */
    public int f118783e = 0;

    /* renamed from: f */
    private boolean f118784f = false;

    /* renamed from: i */
    TrackingSource f118787i = null;

    /* renamed from: j */
    private final Object f118788j = C24730d.m128465h().m128474i();

    /* renamed from: k */
    long f118789k = System.currentTimeMillis();

    /* renamed from: l */
    private final int f118790l = new Random().nextInt(Integer.MAX_VALUE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd0.f$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC24232j {
        a() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C24732f.this.m128487i(bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C24732f.this.m128486h(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd0.f$b */
    /* loaded from: classes4.dex */
    public class b extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ File f118793v0;

        /* renamed from: w0 */
        final /* synthetic */ InterfaceC24232j f118794w0;

        b(File file, InterfaceC24232j interfaceC24232j) {
            this.f118793v0 = file;
            this.f118794w0 = interfaceC24232j;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            if (file != null) {
                try {
                    if (file.exists() && c23995f.m125657h() == 200) {
                        C24732f.this.f118779a = this.f118793v0.getAbsolutePath();
                        C24732f c24732f = C24732f.this;
                        c24732f.m128485f(c24732f.f118779a, this.f118794w0);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            if (C24732f.this.f118781c != null) {
                C24732f c24732f2 = C24732f.this;
                c24732f2.f118782d = EnumC24733g.ERROR;
                c24732f2.f118781c.mo50008c(new C20096c(50001, AbstractC20095b.f98829a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24732f(String str, EnumC24734h enumC24734h, InterfaceC24223a interfaceC24223a) {
        this.f118779a = str;
        this.f118780b = enumC24734h;
        this.f118781c = interfaceC24223a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m128485f(String str, InterfaceC24232j interfaceC24232j) {
        EnumC24229g enumC24229g;
        int i11 = this.f118790l;
        if (this.f118780b == EnumC24734h.AVATAR) {
            enumC24229g = EnumC24229g.f116988v;
        } else {
            enumC24229g = EnumC24229g.f116989w;
        }
        C24230h m126395Q = C24226d.m126395Q(i11, enumC24229g, str, 0L, false);
        this.f118791m = m126395Q;
        m126395Q.m126501d0(this.f118785g);
        this.f118791m.m126514l0(this.f118783e);
        this.f118791m.m126524s0(this.f118786h);
        this.f118791m.m126535z0(this.f118787i);
        this.f118791m.m126505h(interfaceC24232j);
        C24730d.m128465h().m128479r(this);
        C24226d.m126402Z(this.f118791m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m128486h(C20096c c20096c) {
        try {
            boolean z11 = true;
            AbstractC20110a.m104535d("onErrorData: %s", c20096c);
            synchronized (this.f118788j) {
                this.f118782d = EnumC24733g.ERROR;
            }
            String str = "";
            if (c20096c != null && c20096c.m104491c() != 0) {
                int m104491c = c20096c.m104491c();
                C31973j5 m4472f = C0943w.f3447a.m4472f(String.valueOf(this.f118783e));
                if (m4472f == null || !m4472f.m153747Y()) {
                    z11 = false;
                }
                if (m104491c != 0) {
                    if (m104491c != 19001 && m104491c != 19002 && m104491c != 19003 && m104491c != 18002) {
                        if (m104491c != 18004 && m104491c != 19004 && m104491c != 18001) {
                            if (m104491c != 18026 && m104491c != 18027) {
                                if (m104491c == 17002 && this.f118780b == EnumC24734h.GROUP_AVATAR) {
                                    AbstractC23161o1.m119320e(c20096c, z11);
                                    C24730d.m128465h().m128476o(C26639b.m136745d(this.f118783e));
                                } else if (m104491c == 17007 && this.f118780b == EnumC24734h.GROUP_AVATAR) {
                                    AbstractC23161o1.m119320e(c20096c, z11);
                                    C24730d.m128465h().m128476o(C26639b.m136745d(this.f118783e));
                                } else {
                                    C24730d.m128465h().m128479r(this);
                                    ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
                                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                                }
                            }
                            if (this.f118780b == EnumC24734h.AVATAR) {
                                str = AbstractC23047d8.m118251c(c20096c);
                                C24730d.m128465h().m128476o(CoreUtility.f89233i);
                            }
                        }
                        EnumC24734h enumC24734h = this.f118780b;
                        if (enumC24734h == EnumC24734h.AVATAR) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_error_invalidImage);
                            C24730d.m128465h().m128476o(CoreUtility.f89233i);
                        } else if (enumC24734h == EnumC24734h.GROUP_AVATAR) {
                            ToastUtils.m89266n(AbstractC8020f0.str_toast_error_invalidImage, new Object[0]);
                            C24730d.m128465h().m128476o(C26639b.m136745d(this.f118783e));
                        }
                    }
                    EnumC24734h enumC24734h2 = this.f118780b;
                    if (enumC24734h2 == EnumC24734h.AVATAR) {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_warningUploadImg);
                        C24730d.m128465h().m128476o(CoreUtility.f89233i);
                    } else if (enumC24734h2 == EnumC24734h.GROUP_AVATAR) {
                        ToastUtils.m89266n(AbstractC8020f0.str_toast_warningUploadImg, new Object[0]);
                        C24730d.m128465h().m128476o(C26639b.m136745d(this.f118783e));
                    }
                } else {
                    C24730d.m128465h().m128479r(this);
                    ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                }
            } else {
                C24730d.m128465h().m128479r(this);
                EnumC24734h enumC24734h3 = this.f118780b;
                if (enumC24734h3 != EnumC24734h.AVATAR && enumC24734h3 != EnumC24734h.GROUP_AVATAR) {
                    ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
                }
                ToastUtils.m89266n(AbstractC8020f0.str_toast_updateAvtFail, new Object[0]);
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtFail);
            }
            InterfaceC24223a interfaceC24223a = this.f118781c;
            if (interfaceC24223a != null) {
                if (c20096c != null) {
                    if (this.f118780b == EnumC24734h.GROUP_AVATAR && c20096c.m104491c() == 17007) {
                        this.f118781c.mo50008c(c20096c);
                        return;
                    } else {
                        if (this.f118780b == EnumC24734h.AVATAR) {
                            this.f118781c.mo50007b(str);
                            return;
                        }
                        return;
                    }
                }
                interfaceC24223a.mo50008c(new C20096c(502, AbstractC23161o1.m119318c(502, this.f118779a)));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m128487i(AbstractC25751q abstractC25751q) {
        try {
            AbstractC20110a.m104535d("onDataProcessed: %s", abstractC25751q);
            if (!C24730d.m128465h().m128470d(this)) {
                synchronized (this.f118788j) {
                    this.f118782d = EnumC24733g.CANCEL;
                }
                return;
            }
            synchronized (this.f118788j) {
                try {
                    EnumC24733g enumC24733g = EnumC24733g.UPLOADED;
                    this.f118782d = enumC24733g;
                    EnumC24734h enumC24734h = this.f118780b;
                    if (enumC24734h == EnumC24734h.AVATAR && (abstractC25751q instanceof C25735a)) {
                        C25735a c25735a = (C25735a) abstractC25751q;
                        String m132850b = c25735a.m132850b();
                        String m132849a = c25735a.m132849a();
                        if (!"null".equals(m132850b) && !m132850b.trim().equals("") && !"-2".equals(m132850b)) {
                            C23744a.m124114c().m124116d(116, new Object[0]);
                            this.f118782d = enumC24733g;
                            Intent intent = new Intent();
                            intent.putExtra("urlUploaded", this.f118779a);
                            intent.putExtra("picId", m132849a);
                            C24730d.m128465h().m128476o(CoreUtility.f89233i);
                            InterfaceC24223a interfaceC24223a = this.f118781c;
                            if (interfaceC24223a != null) {
                                interfaceC24223a.mo50006a(intent);
                            }
                        }
                        m128486h(new C20096c(502, AbstractC23161o1.m119318c(502, m132850b)));
                        this.f118782d = EnumC24733g.ERROR;
                    } else if (enumC24734h == EnumC24734h.GROUP_AVATAR && (abstractC25751q instanceof C25746l)) {
                        String m132873a = ((C25746l) abstractC25751q).m132873a();
                        if (!"null".equals(m132873a) && !m132873a.trim().equals("") && !"-2".equals(m132873a)) {
                            this.f118782d = enumC24733g;
                            Intent intent2 = new Intent();
                            intent2.putExtra("urlUploaded", this.f118779a);
                            intent2.putExtra("groupID", String.valueOf(this.f118783e));
                            intent2.putExtra("urlUploadedServer", m132873a);
                            intent2.putExtra("showSuccessMsg", this.f118784f);
                            C24730d.m128465h().m128476o(C26639b.m136745d(this.f118783e));
                            InterfaceC24223a interfaceC24223a2 = this.f118781c;
                            if (interfaceC24223a2 != null) {
                                interfaceC24223a2.mo50006a(intent2);
                            }
                        }
                        m128486h(new C20096c(502, AbstractC23161o1.m119318c(502, m132873a)));
                        this.f118782d = EnumC24733g.ERROR;
                    }
                } finally {
                }
            }
            return;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m128486h(C26638a.f126094a.m136734c());
            C24730d.m128465h().m128479r(this);
            synchronized (this.f118788j) {
            }
        }
        AbstractC20110a.m104539h(e11);
        m128486h(C26638a.f126094a.m136734c());
        C24730d.m128465h().m128479r(this);
        synchronized (this.f118788j) {
            this.f118782d = EnumC24733g.ERROR;
        }
    }

    /* renamed from: j */
    private void m128488j(InterfaceC24232j interfaceC24232j) {
        try {
            if (this.f118779a.startsWith("http")) {
                File file = new File(AbstractC20130d.m104905y(), AbstractC23352g.m122788d(this.f118779a) + ".jpg");
                if (file.exists() && file.length() > 0) {
                    this.f118779a = file.getAbsolutePath();
                    m128485f(file.getAbsolutePath(), interfaceC24232j);
                    return;
                } else {
                    file.delete();
                    new C23528a(MainApplication.getAppContext()).m123600e(this.f118779a, file, new b(file, interfaceC24232j));
                    return;
                }
            }
            m128485f(this.f118779a, interfaceC24232j);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m128489e() {
        try {
            if (this.f118780b == EnumC24734h.AVATAR && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                C24730d.m128465h().m128476o(CoreUtility.f89233i);
            }
            this.f118782d = EnumC24733g.CANCEL;
            C24230h c24230h = this.f118791m;
            if (c24230h != null) {
                c24230h.m126509j();
                C24226d.m126388J(this.f118791m);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m128490g(String str, EnumC24734h enumC24734h) {
        EnumC24734h enumC24734h2 = this.f118780b;
        if (enumC24734h2 != enumC24734h && (enumC24734h2 != EnumC24734h.AVATAR || enumC24734h != EnumC24734h.GROUP_AVATAR)) {
            return false;
        }
        return this.f118779a.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m128491k(int i11, boolean z11) {
        this.f118783e = i11;
        this.f118784f = z11;
    }

    /* renamed from: l */
    public void m128492l(boolean z11) {
        this.f118786h = z11;
    }

    /* renamed from: m */
    public void m128493m(InterfaceC24223a interfaceC24223a) {
        this.f118781c = interfaceC24223a;
    }

    /* renamed from: n */
    public void m128494n(TrackingSource trackingSource) {
        this.f118787i = trackingSource;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m128495o() {
        try {
            AbstractC20110a.m104535d("startUpload: %s", this.f118779a);
            a aVar = new a();
            synchronized (this.f118788j) {
                try {
                    EnumC24733g enumC24733g = this.f118782d;
                    EnumC24733g enumC24733g2 = EnumC24733g.UPLOADING;
                    if (enumC24733g == enumC24733g2) {
                        C24730d.m128465h().m128471e();
                        return;
                    }
                    EnumC24734h enumC24734h = this.f118780b;
                    EnumC24734h enumC24734h2 = EnumC24734h.AVATAR;
                    if (enumC24734h != enumC24734h2 && enumC24734h != EnumC24734h.GROUP_AVATAR) {
                        this.f118782d = EnumC24733g.ERROR;
                        C24730d.m128465h().m128471e();
                    } else {
                        this.f118782d = enumC24733g2;
                        if (enumC24734h == enumC24734h2) {
                            m128485f(this.f118779a, aVar);
                        } else {
                            m128488j(aVar);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            synchronized (this.f118788j) {
                try {
                    this.f118782d = EnumC24733g.ERROR;
                    InterfaceC24223a interfaceC24223a = this.f118781c;
                    if (interfaceC24223a != null) {
                        interfaceC24223a.mo50008c(new C20096c(502, AbstractC23161o1.m119318c(502, this.f118779a)));
                    }
                } finally {
                }
            }
        }
    }

    public String toString() {
        return "source:" + this.f118779a + "\ntype:" + this.f118780b + "\nstate:" + this.f118782d + '\n';
    }
}
