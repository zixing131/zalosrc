package p322lf;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.utils.ToastUtils;
import org.json.JSONArray;
import p100df.EnumC17910b;
import p127eb.C18373b;
import p207he.C20024r;
import p322lf.AbstractC22466g;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import th.AbstractC26683d;
import ve.AbstractC27985d;
import xh0.C29643e0;
import zh0.AbstractC32212c;

/* renamed from: lf.k */
/* loaded from: classes3.dex */
public abstract class AbstractC22470k {
    /* renamed from: b */
    public static boolean m116150b(boolean z11, int i11, int i12) {
        boolean z12;
        if (!m116158j(i11, 1) && (i12 == 2 || !m116158j(i11, 3, 2))) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 && z12 && AbstractC0924m0.m4076oa()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m116151c() {
        return m116152d(true);
    }

    /* renamed from: d */
    public static boolean m116152d(boolean z11) {
        if (m116153e(z11) && m116154f(z11) && m116155g(z11)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m116153e(boolean z11) {
        if (C20024r.m103942k(false)) {
            if (z11) {
                ToastUtils.m89266n(AbstractC8020f0.str_call_cannot_open_camera_while_in_call, new Object[0]);
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m116154f(boolean z11) {
        if (C18373b.m97334c().m97339f()) {
            if (z11) {
                ToastUtils.m89266n(AbstractC8020f0.ls_can_not_open_camera, new Object[0]);
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m116155g(boolean z11) {
        CommonZaloview m94487c = EnumC17910b.INSTANCE.m94487c();
        if (m94487c != null && m94487c.mo78963ru()) {
            if (z11) {
                ToastUtils.m89266n(AbstractC8020f0.camera_connect_error, new Object[0]);
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m116156h(CameraInputParams cameraInputParams) {
        if (!AbstractC26683d.f126402u) {
            return false;
        }
        if (!cameraInputParams.f41095N && cameraInputParams.f41129s != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m116157i(CameraInputParams cameraInputParams) {
        boolean m116158j;
        if (AbstractC23309i.m121602Xe()) {
            m116158j = m116158j(cameraInputParams.f41129s, 7, 1);
        } else {
            m116158j = m116158j(cameraInputParams.f41129s, 7);
        }
        if (m116158j || cameraInputParams.f41092K) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m116158j(int i11, int... iArr) {
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i11 == i12) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static ZaloCameraView m116159k() {
        ZaloCameraView m94488d = EnumC17910b.INSTANCE.m94488d();
        if (m94488d == null || !m94488d.mo78963ru()) {
            return null;
        }
        return m94488d;
    }

    /* renamed from: l */
    public static void m116160l() {
        if (C29643e0.m147392a() != -1) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: lf.j
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22470k.m116163o();
            }
        });
    }

    /* renamed from: m */
    public static boolean m116161m() {
        ZaloCameraView m94488d = EnumC17910b.INSTANCE.m94488d();
        if (m94488d != null) {
            return m94488d.mo78963ru();
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m116162n() {
        if (Build.MODEL == null) {
            return false;
        }
        boolean m155333c = AbstractC32212c.m155333c();
        String m121439T = AbstractC23309i.m121439T();
        if (TextUtils.isEmpty(m121439T)) {
            return m155333c;
        }
        try {
            JSONArray jSONArray = new JSONArray(m121439T);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (Build.MODEL.startsWith(jSONArray.optString(i11))) {
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: o */
    public static /* synthetic */ void m116163o() {
        int m3007E;
        if (m116162n()) {
            m3007E = 0;
        } else {
            m3007E = AbstractC0924m0.m3007E();
        }
        C29643e0.m147396e(m3007E);
    }

    /* renamed from: p */
    public static boolean m116164p(int i11, int... iArr) {
        return !m116158j(i11, iArr);
    }

    /* renamed from: q */
    public static void m116165q(VideoBlendingParam videoBlendingParam, String str, StoryMusicAttachment storyMusicAttachment, AbstractC22466g.b bVar, int i11, Boolean bool) {
        if (m116158j(7, i11)) {
            AbstractC22466g.m116131e(videoBlendingParam, str, storyMusicAttachment, bVar, bool);
        } else {
            AbstractC27985d.m141000q(videoBlendingParam, bVar);
        }
    }

    /* renamed from: r */
    public static void m116166r(String str, AbstractC22466g.b bVar, int i11) {
        if (m116158j(7, i11)) {
            AbstractC22466g.m116132f(str, bVar);
        } else {
            AbstractC27985d.m141001r(str, bVar);
        }
    }

    /* renamed from: s */
    public static ZaloCameraView m116167s(InterfaceC27218a interfaceC27218a, int i11, int i12, CameraInputParams cameraInputParams) {
        return m116168t(interfaceC27218a, i11, i12, cameraInputParams, null);
    }

    /* renamed from: t */
    public static ZaloCameraView m116168t(InterfaceC27218a interfaceC27218a, int i11, int i12, CameraInputParams cameraInputParams, Bundle bundle) {
        int i13;
        boolean z11;
        if (interfaceC27218a == null || interfaceC27218a.mo35579p() == null) {
            return null;
        }
        int i14 = cameraInputParams.f41129s;
        int[] iArr = ZaloCameraView.f40830P2;
        if (m116164p(i14, iArr) && (!m116151c() || m116161m())) {
            ToastUtils.showMess(interfaceC27218a.getContext().getString(AbstractC8020f0.connect_camera_error));
            return null;
        }
        if (interfaceC27218a.mo35576n3()) {
            i13 = AbstractC6918a0.chat_head_full_container;
        } else {
            i13 = R.id.content;
        }
        if (interfaceC27218a.mo35585v() != null && interfaceC27218a.mo35585v().getId() != 0) {
            i13 = interfaceC27218a.mo35585v().getId();
        }
        int i15 = i13;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("extra_input_params", cameraInputParams);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (m116164p(cameraInputParams.f41129s, iArr) && cameraInputParams.f41121n0 && bundle != null && bundle.containsKey("extra_input_contact_profile")) {
            z11 = true;
        } else {
            z11 = false;
        }
        bundle2.putBoolean("BUNDLE_FORCE_OPEN_MAIN_APP", z11);
        return (ZaloCameraView) interfaceC27218a.mo35579p().mo57057c2(i15, ZaloCameraView.class, bundle2, i11, "ZaloCameraView", i12, true);
    }
}
