package p483rh;

import android.os.Bundle;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.zview.ZaloView;
import java.util.List;
import org.json.JSONObject;
import p542ub.InterfaceC27218a;

/* renamed from: rh.a */
/* loaded from: classes3.dex */
public interface InterfaceC25792a {

    /* renamed from: rh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m132931a(InterfaceC25792a interfaceC25792a, String str, int i11, InterfaceC27218a interfaceC27218a, String str2, ZaloView zaloView, c cVar, String str3, b bVar, Bundle bundle, int i12, Object obj) {
            ZaloView zaloView2;
            c cVar2;
            String str4;
            b bVar2;
            Bundle bundle2;
            if (obj == null) {
                if ((i12 & 16) != 0) {
                    zaloView2 = null;
                } else {
                    zaloView2 = zaloView;
                }
                if ((i12 & 32) != 0) {
                    cVar2 = null;
                } else {
                    cVar2 = cVar;
                }
                if ((i12 & 64) != 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                if ((i12 & 128) != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if ((i12 & 256) != 0) {
                    bundle2 = AbstractC1438d.m7340a();
                } else {
                    bundle2 = bundle;
                }
                interfaceC25792a.mo4495a(str, i11, interfaceC27218a, str2, zaloView2, cVar2, str4, bVar2, bundle2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handle");
        }
    }

    /* renamed from: rh.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        boolean mo40736a(String str);

        /* renamed from: b */
        void mo40737b(JSONObject jSONObject);

        /* renamed from: c */
        void mo40738c(String str, JSONObject jSONObject, String str2);

        /* renamed from: d */
        int mo40739d();

        /* renamed from: e */
        void mo40740e(String str, String str2);

        /* renamed from: f */
        void mo40741f(String str, int i11, JSONObject jSONObject, String str2);

        /* renamed from: g */
        void mo40742g();

        /* renamed from: h */
        void mo40743h();

        /* renamed from: i */
        void mo40744i();

        /* renamed from: j */
        void mo40745j(String str);

        /* renamed from: l */
        boolean mo40747l(String str);

        /* renamed from: m */
        void mo40748m(String str);

        /* renamed from: n */
        void mo40749n(List list, int i11);

        /* renamed from: o */
        void mo40750o();

        /* renamed from: p */
        void mo40751p(String str);

        /* renamed from: q */
        void mo40752q(String str);

        /* renamed from: r */
        void mo40753r(String str, String str2, String str3);

        /* renamed from: s */
        void mo40754s(String str);

        /* renamed from: t */
        void mo40755t(String str, String str2, String str3);
    }

    /* renamed from: rh.a$c */
    /* loaded from: classes3.dex */
    public interface c {

        /* renamed from: rh.a$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m132932a(c cVar, String str, String str2, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 2) != 0) {
                        str2 = null;
                    }
                    cVar.mo39930a(str, str2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
            }
        }

        /* renamed from: a */
        void mo39930a(String str, String str2);
    }

    /* renamed from: a */
    void mo4495a(String str, int i11, InterfaceC27218a interfaceC27218a, String str2, ZaloView zaloView, c cVar, String str3, b bVar, Bundle bundle);
}
