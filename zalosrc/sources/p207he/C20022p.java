package p207he;

import ae.C0766k;
import ag0.C0829l0;
import android.app.Activity;
import android.text.TextUtils;
import bp0.AbstractC3096i0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.plugin.IVoipZalo;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import dj.C17945a0;
import eg0.C18427b;
import gp0.C19561o0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hm0.InterfaceC20098e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import jm0.InterfaceC21299i;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23171p0;
import me0.AbstractC23174p3;
import me0.AbstractC23204s0;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p609wh.C29037t0;
import s00.AbstractC26080o;
import vg.C28023b6;
import vg.C28203u6;
import wd0.C28931k;
import xd0.C29593i;
import zm.voip.service.C32257b4;

/* renamed from: he.p */
/* loaded from: classes3.dex */
public class C20022p implements IVoipZalo {

    /* renamed from: g */
    private static final String f98434g = "p";

    /* renamed from: a */
    private C20010d f98435a;

    /* renamed from: b */
    private boolean f98436b = false;

    /* renamed from: c */
    private boolean f98437c = false;

    /* renamed from: d */
    private boolean f98438d = false;

    /* renamed from: e */
    private String f98439e = "";

    /* renamed from: f */
    private String f98440f = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.p$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ IVoipServiceRequestCallback f98441a;

        a(IVoipServiceRequestCallback iVoipServiceRequestCallback) {
            this.f98441a = iVoipServiceRequestCallback;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            try {
                this.f98441a.onRequestFailed(c20096c.m104492d());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                this.f98441a.onRequestComplete(jSONObject.toString());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: he.p$b */
    /* loaded from: classes3.dex */
    class b implements InterfaceC20098e {
        b() {
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            C20022p.this.f98437c = false;
            AbstractC23041d2.m118208g(C20022p.this.f98439e);
            AbstractC23041d2.m118208g(C20022p.this.f98440f);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            C20022p.this.f98437c = false;
            AbstractC23041d2.m118208g(C20022p.this.f98439e);
            AbstractC23041d2.m118208g(C20022p.this.f98440f);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
        }
    }

    /* renamed from: he.p$c */
    /* loaded from: classes3.dex */
    class c implements InterfaceC20098e {
        c() {
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            C20022p.this.f98436b = false;
            AbstractC23041d2.m118208g(C20022p.this.f98439e);
            AbstractC23041d2.m118208g(C20022p.this.f98440f);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            C20022p.this.f98436b = false;
            AbstractC23041d2.m118208g(C20022p.this.f98439e);
            AbstractC23041d2.m118208g(C20022p.this.f98440f);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
        }
    }

    /* renamed from: he.p$d */
    /* loaded from: classes3.dex */
    class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ IVoipServiceRequestCallback f98445a;

        d(IVoipServiceRequestCallback iVoipServiceRequestCallback) {
            this.f98445a = iVoipServiceRequestCallback;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                this.f98445a.onRequestFailed(c20096c.m104491c() + " " + c20096c.m104492d());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    if (C7960e.m41971c6() != null && contactProfile.f42434r.length() > 0 && !contactProfile.f42434r.equalsIgnoreCase("null")) {
                        C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                    }
                    this.f98445a.onRequestComplete(contactProfile.m40373K());
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C20022p.f98434g, e11);
                    this.f98445a.onRequestFailed("UNKNOWN");
                }
            }
        }
    }

    /* renamed from: he.p$e */
    /* loaded from: classes3.dex */
    class e implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ IVoipServiceRequestCallback f98447a;

        e(IVoipServiceRequestCallback iVoipServiceRequestCallback) {
            this.f98447a = iVoipServiceRequestCallback;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            if (c20096c != null) {
                this.f98447a.onRequestFailed(c20096c.m104492d());
                if (c20096c.m104491c() == 50001) {
                    ToastUtils.m89262j();
                }
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            this.f98447a.onRequestComplete(jSONObject.toString());
        }
    }

    /* renamed from: he.p$f */
    /* loaded from: classes3.dex */
    class f implements InterfaceC20098e {

        /* renamed from: a */
        final /* synthetic */ String f98449a;

        /* renamed from: b */
        final /* synthetic */ String f98450b;

        f(String str, String str2) {
            this.f98449a = str;
            this.f98450b = str2;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            C20022p.this.f98438d = false;
            AbstractC23041d2.m118211j(new File(this.f98449a));
            AbstractC23041d2.m118208g(this.f98450b);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            C20022p.this.f98438d = false;
            AbstractC23041d2.m118211j(new File(this.f98449a));
            AbstractC23041d2.m118208g(this.f98450b);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
        }
    }

    /* renamed from: h */
    private C29037t0 m103932h(IVoipServiceRequestCallback iVoipServiceRequestCallback) {
        return new C29037t0(new a(iVoipServiceRequestCallback));
    }

    /* renamed from: i */
    private C29037t0 m103933i(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11) {
        C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
        if (AbstractC23309i.m121110K3() && i11 > 0) {
            m103932h.m110316k0(i11);
        }
        return m103932h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m103934j(boolean z11, int i11, String str) {
        String str2;
        try {
            if (z11) {
                str2 = CoreUtility.f89233i;
            } else {
                str2 = "" + i11;
            }
            C17945a0.w wVar = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", "" + i11, str2), 0);
            wVar.m95382r(str);
            if (z11) {
                wVar.m95386v(2);
            }
            wVar.m95387w(0);
            C17945a0 m95365a = wVar.m95365a();
            m95365a.m94951M9();
            m95365a.m95066Ya("" + i11);
            AbstractC23306f.m120681k0().m101500a(new C29593i.a(String.valueOf(i11), m95365a, C28931k.d.m144581e()));
            AbstractC23306f.m120724x().m99492f(m95365a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void answerPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 427);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void broadCastState(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, String str) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(i14);
            byteArrayOutputStream.write(i15);
            byteArrayOutputStream.write(i16);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i13);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 461);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118271f()) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void calleeRequestNewServer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 440);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void callerAnswerNewServer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 441);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void cancelCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 405);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void finishCallZRTP(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr) {
        long nanoTime;
        try {
            if (C19561o0.m102161L().m102226T() <= 0) {
                nanoTime = C23793c.m124316k().mo124310e();
            } else {
                nanoTime = ((System.nanoTime() - C19561o0.m102161L().m102228U()) / 1000000) + C19561o0.m102161L().m102226T();
            }
            C20020n.m103908m().m103916u(new C20007a(Integer.parseInt(CoreUtility.f89233i), i14, 0, i11, i12, i13, i15, i16, new String(bArr, StandardCharsets.UTF_8), nanoTime));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void getProfile(IVoipServiceRequestCallback iVoipServiceRequestCallback, String str) {
        int i11;
        if (iVoipServiceRequestCallback == null) {
            return;
        }
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42434r) && !TextUtils.isEmpty(m141809c.f42446v) && !TextUtils.isEmpty(m141809c.f42437s)) {
                iVoipServiceRequestCallback.onRequestComplete(m141809c.m40373K());
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(iVoipServiceRequestCallback));
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1019));
        } catch (Exception e11) {
            e11.printStackTrace();
            iVoipServiceRequestCallback.onRequestFailed("UNKNOWN");
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupAddUser(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, String str, int i12, int i13, int i14, String str2, String str3) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(i14);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str2.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str3.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str3.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i11);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 456);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118272g(true)) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupAnswerCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str2.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i13);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 454);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118272g(true)) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupCancelCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str2.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i13);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 453);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118272g(true)) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupEndCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, String str) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(i14);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(i15));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i13);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 455);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118272g(true)) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupInitCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, String str, int i12, int i13, String str2, String str3, int i14) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(i13);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str2.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str3.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str3.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i11);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 451);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118271f()) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupJoin(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, String str) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i15));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i11);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 457);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118272g(true)) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupPing(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, String str) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(i14);
            byteArrayOutputStream.write(i15);
            byteArrayOutputStream.write(i16);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i13);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 460);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118271f()) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupRequestCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, int i14, String str2) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            if (str2 == null) {
                str2 = "";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(i12);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
                byteArrayOutputStream.write(str.getBytes("UTF-8"));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
                byteArrayOutputStream.write(str2.getBytes("UTF-8"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 450);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupSendLogCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, int i14, int i15, long j11, String str2, int i16) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i15));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str2.getBytes("UTF-8"));
            byteArrayOutputStream.write(i16);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i12);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 459);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118271f()) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void groupSentRingRing(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, String str) {
        C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
        m103933i.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(i14);
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes("UTF-8").length));
            byteArrayOutputStream.write(str.getBytes("UTF-8"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        requestPacket.m93273D(i12);
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 452);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m103933i.m110313i0(requestPacket);
        if (C23055e5.m118271f()) {
            C0829l0.m2174c(m103933i);
        } else {
            m103933i.mo51554n();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void incomingPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 426);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public boolean isSupportSendPhotoInCall() {
        if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(MainApplication.getAppContext())) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void mSendVoiceFeedbackRating(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, byte b11, int i12, int i13, byte b12, byte b13, int[] iArr, short s7, byte[] bArr) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(b11);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(b12);
                byteArrayOutputStream.write(b13);
                for (int i14 : iArr) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
                }
                byteArrayOutputStream.write(AbstractC17522a.m93345h(s7));
                byteArrayOutputStream.write(bArr);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 420);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public String mUidToPhoneName(String str, String str2) {
        ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
        if (m141811g == null) {
            return AbstractC21935u.m114542i(str, str2);
        }
        return AbstractC21935u.m114540g(m141811g.f42455y, str, m141811g.f42437s, true);
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void notifyIncomingCall() {
        C23744a.m124114c().m124116d(42, new Object[0]);
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void pingCall11(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(i12);
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 445);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void requestPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 425);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void sendCoreDataToPartner(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 432);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void sendDeviceError(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 448);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void sendHijackNativeCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, long j11, int i13) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g((int) j11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 429);
            requestPacket.m93275F((byte) i13);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void sendMessageLiveAnim(IVoipServiceRequestCallback iVoipServiceRequestCallback, long j11, String str, int i11, String str2, int i12, int i13) {
        String str3;
        if (iVoipServiceRequestCallback == null) {
            return;
        }
        try {
            C29037t0 c29037t0 = new C29037t0(new e(iVoipServiceRequestCallback));
            c29037t0.f103775r = 2;
            if (AbstractC25495a.m132079d(str)) {
                str3 = AbstractC25495a.m132088m(str);
            } else {
                str3 = str;
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 2);
            requestPacket.m93302x((byte) 1);
            requestPacket.m93274E((byte) i13);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93297s(Integer.parseInt(str3));
            if (AbstractC25495a.m132079d(str)) {
                requestPacket.m93298t((byte) 4);
            } else {
                requestPacket.m93298t((byte) 3);
            }
            requestPacket.m93299u(j11);
            if (AbstractC25495a.m132079d(str)) {
                requestPacket.m93295q((short) 1691);
            } else {
                requestPacket.m93295q((short) 1692);
            }
            requestPacket.m93275F((byte) 0);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (str2 == null) {
                    str2 = "";
                }
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
                byteArrayOutputStream.write(bytes);
                if (i11 == 1) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                }
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            } else {
                iVoipServiceRequestCallback.onRequestFailed("NETWORK_ERROR");
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            iVoipServiceRequestCallback.onRequestFailed("UNKNOWN");
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void sendSticker(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 444);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void setStateInCall(boolean z11, String str) {
        if (AbstractC23165o5.m119333b()) {
            if (z11) {
                AbstractC23304d.f113294K0 = true;
                AbstractC23309i.m122595xx(true);
            } else {
                if (AbstractC23174p3.m119377b()) {
                    AbstractC23304d.f113266D0 = true;
                    AbstractC23309i.m121506Ut(true);
                }
                AbstractC23304d.f113294K0 = false;
                AbstractC23309i.m122595xx(false);
            }
        }
        if (!z11) {
            C23744a.m124114c().m124116d(41, new Object[0]);
        } else {
            C28023b6.m141250h0().m141378s(str);
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void showMsgVoiceCall(final int i11, final String str, final boolean z11) {
        C23288a.f113033a.mo13474a(new C18427b(String.valueOf(i11), new Runnable() { // from class: he.o
            @Override // java.lang.Runnable
            public final void run() {
                C20022p.m103934j(z11, i11, str);
            }
        }));
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void startLog(String str) {
        try {
            AbstractC23647d.m123907q(str, "");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void submitReceivedZinstantACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 449);
            requestPacket.m93275F((byte) 2);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void submitZinstantInteraction(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93344g(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 449);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void switchToVideoCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(i12);
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 412);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void trackingStateCallActivity(boolean z11, Activity activity, long j11) {
        int i11;
        if (z11) {
            i11 = 2;
        } else {
            i11 = 5;
        }
        AbstractC23174p3.m119383h(i11, activity, j11);
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void uploadCallGroupLog(int i11, long j11, int i12, long j12, int i13, String str) {
        if (this.f98437c) {
            return;
        }
        try {
            this.f98437c = true;
            String replace = MainApplication.getAppContext().getFilesDir().getPath().replace("/files", "");
            this.f98439e = str;
            String str2 = replace + "/callgrouplog.zip";
            this.f98440f = str2;
            AbstractC20887g.m109227e(this.f98439e, str2);
            this.f98435a = new C20010d();
            Hashtable hashtable = new Hashtable();
            hashtable.put("call_id", "" + i11);
            hashtable.put("duration", "" + j11);
            hashtable.put("host_call", "" + i12);
            hashtable.put("join_time", "" + j12);
            hashtable.put("owner_id", "" + i13);
            hashtable.put("log_type", "3");
            hashtable.put("time_stamp", "" + System.currentTimeMillis());
            this.f98435a.m103838l(this.f98440f, new b(), hashtable, CoreUtility.f89232h, CoreUtility.f89226b, CoreUtility.f89227c);
        } catch (Exception e11) {
            this.f98437c = false;
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void uploadCallLog(int i11, int i12, int i13, long j11, long j12, String str) {
        if (this.f98436b) {
            return;
        }
        try {
            this.f98436b = true;
            String replace = MainApplication.getAppContext().getFilesDir().getPath().replace("/files", "");
            this.f98439e = str;
            String str2 = replace + "/calllog.zip";
            this.f98440f = str2;
            AbstractC20887g.m109227e(this.f98439e, str2);
            this.f98435a = new C20010d();
            Hashtable hashtable = new Hashtable();
            hashtable.put("call_id", "" + i11);
            hashtable.put("owner_id", "" + i12);
            hashtable.put("partner_id", "" + i13);
            hashtable.put("time_stamp", "" + j11);
            hashtable.put("duration", "" + j12);
            this.f98435a.m103838l(this.f98440f, new c(), hashtable, CoreUtility.f89232h, CoreUtility.f89226b, CoreUtility.f89227c);
        } catch (Exception e11) {
            this.f98436b = false;
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void uploadSpectrumLog(String str, int i11, int i12, int i13, long j11, long j12, String str2) {
        if (this.f98438d) {
            return;
        }
        try {
            this.f98438d = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC23204s0.m119554e().getAbsoluteFile());
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append("zalo");
            sb2.append(str3);
            sb2.append("voip");
            sb2.append(str3);
            sb2.append("upload");
            File file = new File(sb2.toString());
            if (!file.exists()) {
                file.mkdirs();
            } else {
                AbstractC3096i0.m15556p(str2, 600000);
                AbstractC3096i0.m15556p(file.getAbsolutePath(), 600000);
            }
            String str4 = file.getAbsolutePath() + "/spectrumLog_" + i11 + ".zip";
            AbstractC20887g.m109222I(str2, str4);
            this.f98435a = new C20010d();
            Hashtable hashtable = new Hashtable();
            hashtable.put("call_id", "" + i11);
            hashtable.put("owner_id", "" + i12);
            hashtable.put("partner_id", "" + i13);
            hashtable.put("time_stamp", "" + j11);
            hashtable.put("duration", "" + j12);
            hashtable.put("log_type", "1");
            hashtable.put("extend", "");
            this.f98435a.m103839m(str, str4, new f(str2, str4), hashtable, CoreUtility.f89232h, CoreUtility.f89226b, CoreUtility.f89227c);
        } catch (Exception e11) {
            this.f98438d = false;
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceAnswerACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 408);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceCallRinging(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, String str) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.getBytes(charset).length));
                byteArrayOutputStream.write(str.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 407);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceCommandACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 423);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceEndCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2, String str3, int i14) {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write((byte) i12);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.length()));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(str.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.length()));
                byteArrayOutputStream.write(str2.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str3.length()));
                byteArrayOutputStream.write(str3.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            boolean z11 = true;
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 409);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C32257b4.m155726m().m155737l().m117076X() && AbstractC3096i0.f13167k == 3 && C32257b4.m155726m().m155737l().m117035J0()) {
                z11 = false;
            }
            if (C23055e5.m118272g(z11)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceHoldCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 411);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceInAppACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 422);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceInteractCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, int i14) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
                byteArrayOutputStream.write(bytes);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 421);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceMuteCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 443);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceRequestAnswer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write((byte) i12);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str.length()));
                Charset charset = StandardCharsets.UTF_8;
                byteArrayOutputStream.write(str.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.length()));
                byteArrayOutputStream.write(str2.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str3.length()));
                byteArrayOutputStream.write(str3.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str4.getBytes(charset).length));
                byteArrayOutputStream.write(str4.getBytes(charset));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(str5.getBytes(charset).length));
                byteArrayOutputStream.write(str5.getBytes(charset));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 402);
            requestPacket.m93275F((byte) 3);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1 A[Catch: Exception -> 0x00d5, TryCatch #1 {Exception -> 0x00d5, blocks: (B:3:0x0002, B:13:0x00a0, B:15:0x00d1, B:18:0x00d7, B:24:0x009d, B:6:0x0010, B:11:0x001a, B:21:0x0048), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:3:0x0002, B:13:0x00a0, B:15:0x00d1, B:18:0x00d7, B:24:0x009d, B:6:0x0010, B:11:0x001a, B:21:0x0048), top: B:2:0x0002, inners: #0 }] */
    @Override // com.zing.zalo.plugin.IVoipZalo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void voiceRequestCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, String str2, int i14, int i15, int i16, String str3, String str4) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(i12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (i12 != 1 && i12 != 3) {
                if (i12 == 2) {
                    Charset charset = StandardCharsets.UTF_8;
                    byteArrayOutputStream.write(str.getBytes(charset).length);
                    byteArrayOutputStream.write(str.getBytes(charset));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes(charset).length));
                    byteArrayOutputStream.write(str2.getBytes(charset));
                }
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 1);
                requestPacket.m93302x((byte) 0);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) 401);
                requestPacket.m93275F((byte) i15);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                m103933i.m110313i0(requestPacket);
                if (!C23055e5.m118272g(true)) {
                    C0829l0.m2174c(m103933i);
                    return;
                } else {
                    m103933i.mo51554n();
                    return;
                }
            }
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            Charset charset2 = StandardCharsets.UTF_8;
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str2.getBytes(charset2).length));
            byteArrayOutputStream.write(str2.getBytes(charset2));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i16));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str3.getBytes(charset2).length));
            byteArrayOutputStream.write(str3.getBytes(charset2));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(str4.getBytes(charset2).length));
            byteArrayOutputStream.write(str4.getBytes(charset2));
            RequestPacket requestPacket2 = new RequestPacket();
            requestPacket2.m93301w((byte) 1);
            requestPacket2.m93302x((byte) 0);
            requestPacket2.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket2.m93274E((byte) 3);
            requestPacket2.m93295q((short) 401);
            requestPacket2.m93275F((byte) i15);
            requestPacket2.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket2);
            if (!C23055e5.m118272g(true)) {
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceRequestCallZRTPWithExtendData(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, byte[] bArr, int i14, byte[] bArr2, int i15, byte[] bArr3, int i16, byte[] bArr4, int i17, byte[] bArr5, int i18, byte[] bArr6, int i19, byte[] bArr7, boolean z11, int i21) {
        try {
            C29037t0 m103933i = m103933i(iVoipServiceRequestCallback, AbstractC26080o.a.f124275b);
            m103933i.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i13));
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i14));
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i15));
                byteArrayOutputStream.write(bArr3);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i16));
                byteArrayOutputStream.write(bArr4);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i17));
                byteArrayOutputStream.write(bArr5);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i18));
                byteArrayOutputStream.write(bArr6);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i19));
                byteArrayOutputStream.write(bArr7);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i21));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 416);
            requestPacket.m93275F(z11 ? (byte) 3 : (byte) 2);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103933i.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103933i);
            } else {
                m103933i.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceRequestChangeZRTP(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i14));
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i15));
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i16));
                byteArrayOutputStream.write(bArr3);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 417);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceRequestChangeZRTPACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, byte[] bArr, int i14, byte[] bArr2, int i15, byte[] bArr3) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i13));
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i14));
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i15));
                byteArrayOutputStream.write(bArr3);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 419);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voiceResumeCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 413);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.plugin.IVoipZalo
    public void voipIncomingAck(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13) {
        try {
            C29037t0 m103932h = m103932h(iVoipServiceRequestCallback);
            m103932h.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 415);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m103932h.m110313i0(requestPacket);
            if (C23055e5.m118272g(true)) {
                C0829l0.m2174c(m103932h);
            } else {
                m103932h.mo51554n();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
