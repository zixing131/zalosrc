package mz;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BulletSpan;
import androidx.core.text.AbstractC1463b;
import bn0.AbstractC2933b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.report_v2.model.ReportMessageAttachment;
import com.zing.zalo.report_v2.model.ReportPhotoAttachment;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryView;
import com.zing.zalo.zview.C17487o0;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23009a3;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import mz.C23491a;
import nb0.C23673d;
import nh0.C23793c;
import nz.C23967d;
import p371nv.C23952g;
import p405ov.C24561c;
import p409oz.C24585b;
import pm0.C24848g0;
import vg.C28203u6;

/* renamed from: mz.c */
/* loaded from: classes4.dex */
public final class C23493c {

    /* renamed from: a */
    public static final C23493c f114055a = new C23493c();

    private C23493c() {
    }

    /* renamed from: b */
    private final String m123308b(int i11) {
        return "photo_" + (i11 + 1) + "_" + C23793c.Companion.m124321a().mo124310e() + ".webp";
    }

    /* renamed from: d */
    private final String m123309d(C17945a0 c17945a0) {
        if (c17945a0.m95208n8()) {
            String m95019U3 = c17945a0.m95019U3();
            AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
            return m95019U3;
        }
        if (c17945a0.m94871D7()) {
            String m95090b5 = c17945a0.m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            return m95090b5;
        }
        if (c17945a0.m95316z8()) {
            String m95090b52 = c17945a0.m95090b5();
            AbstractC19074t.m100207e(m95090b52, "getUrl(...)");
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                C17964g1 c17964g1 = (C17964g1) m94929K2;
                if (c17964g1.m95534l().length() > 0) {
                    return c17964g1.m95534l();
                }
            }
            return m95090b52;
        }
        if (c17945a0.m95306y8()) {
            String m95090b53 = c17945a0.m95090b5();
            AbstractC19074t.m100207e(m95090b53, "getUrl(...)");
            return m95090b53;
        }
        if (c17945a0.m94960N7()) {
            String m95090b54 = c17945a0.m95090b5();
            AbstractC19074t.m100207e(m95090b54, "getUrl(...)");
            return m95090b54;
        }
        String m95019U32 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U32, "getMessage(...)");
        return m95019U32;
    }

    /* renamed from: e */
    private final String m123310e(int i11) {
        return "person";
    }

    /* renamed from: g */
    public static /* synthetic */ String m123311g(C23493c c23493c, String str, String str2, ContactProfile contactProfile, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            contactProfile = null;
        }
        return c23493c.m123319f(str, str2, contactProfile);
    }

    /* renamed from: j */
    public static final boolean m123312j() {
        if (C24585b.Companion.m128049a().m128047z() >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m123313l(int i11, ReportPhotoAttachment reportPhotoAttachment, byte[] bArr, String str) {
    }

    /* renamed from: n */
    private final void m123314n(int i11, String str) {
        C24561c.m127942b("[REPORT_V2]", "ResizeAndCompress fail at " + i11 + ", msg=" + str);
    }

    /* renamed from: o */
    public static final void m123315o(C17487o0 c17487o0, int i11, String str) {
        AbstractC19074t.m100208f(str, "reportUid");
        m123316p(c17487o0, i11, str, f114055a.m123310e(i11));
    }

    /* renamed from: p */
    public static final void m123316p(C17487o0 c17487o0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "reportUid");
        AbstractC19074t.m100208f(str2, "objectName");
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("source_action", i11);
            bundle.putString("object_name", str2);
            bundle.putString("report_uid", str);
            c17487o0.m93069k2(ReportSummaryView.class, bundle, 1, true);
        }
    }

    /* renamed from: a */
    public final CharSequence m123317a(String str) {
        C23491a c23491a;
        boolean z11;
        AbstractC19074t.m100208f(str, "strHtml");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            c23491a = new C23491a();
            c23491a.m123303c(new C23491a.a(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(1.5f)));
        } else {
            c23491a = null;
        }
        Spanned m7441b = AbstractC1463b.m7441b(str, 63, null, c23491a);
        AbstractC19074t.m100207e(m7441b, "fromHtml(...)");
        if (i11 >= 24) {
            try {
                SpannableString spannableString = new SpannableString(m7441b);
                BulletSpan[] bulletSpanArr = (BulletSpan[]) spannableString.getSpans(0, spannableString.length(), BulletSpan.class);
                if (bulletSpanArr != null) {
                    if (bulletSpanArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        int m118742r = AbstractC23136l9.m118742r(10.0f);
                        int m118742r2 = AbstractC23136l9.m118742r(10.0f);
                        int m118742r3 = AbstractC23136l9.m118742r(1.5f);
                        for (BulletSpan bulletSpan : bulletSpanArr) {
                            int spanStart = spannableString.getSpanStart(bulletSpan);
                            int spanEnd = spannableString.getSpanEnd(bulletSpan);
                            int spanFlags = spannableString.getSpanFlags(bulletSpan);
                            if (spanFlags == 0) {
                                spanFlags = 33;
                            }
                            spannableString.removeSpan(bulletSpan);
                            if (spanStart >= 0 && spanEnd >= 0 && spanStart < spanEnd) {
                                spannableString.setSpan(new C23673d(m118742r, m118742r2, m118742r3), spanStart, spanEnd, spanFlags);
                            }
                        }
                        return spannableString;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d("[REPORT_V2]", e11.toString());
            }
        }
        return m7441b;
    }

    /* renamed from: c */
    public final ArrayList m123318c(List list) {
        AbstractC19074t.m100208f(list, "listSelectedMsg");
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (c17945a0.m95029V3().m41053q()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (c17945a0.m95000S0()) {
                    String m123309d = f114055a.m123309d(c17945a0);
                    if (m123309d.length() > 0) {
                        arrayList.add(new ReportMessageAttachment(c17945a0.m95029V3().m41047k(), m123309d));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final String m123319f(String str, String str2, ContactProfile contactProfile) {
        String m40385R;
        AbstractC19074t.m100208f(str, "reportObjectName");
        AbstractC19074t.m100208f(str2, "reportUid");
        if (!AbstractC19074t.m100204b(str, "person") && !AbstractC19074t.m100204b(str, "person.call")) {
            return "";
        }
        if (contactProfile == null) {
            contactProfile = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
        }
        if (contactProfile == null || (m40385R = contactProfile.m40385R(true, false, true)) == null) {
            return "";
        }
        return m40385R;
    }

    /* renamed from: h */
    public final String m123320h(String str) {
        AbstractC19074t.m100208f(str, "reportObjectName");
        if (AbstractC19074t.m100204b(str, "person") || AbstractC19074t.m100204b(str, "person.call")) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_profile_object_name_display);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_profile_object_name_display);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        return m118743r02;
    }

    /* renamed from: i */
    public final String m123321i(String str) {
        AbstractC19074t.m100208f(str, "reportObjectName");
        if (AbstractC19074t.m100204b(str, "person") || AbstractC19074t.m100204b(str, "person.call")) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_profile);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_func_ReportAbuse);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        return m118743r02;
    }

    /* renamed from: k */
    public final boolean m123322k(String str) {
        AbstractC19074t.m100208f(str, "reportAction");
        if (AbstractC19074t.m100204b(str, "person.block")) {
            return true;
        }
        return AbstractC19074t.m100204b(str, "person.unfriend");
    }

    /* renamed from: m */
    public final void m123323m(String str) {
        AbstractC19074t.m100208f(str, "msg");
        C23952g.m125345j("[REPORT_V2]", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: Exception -> 0x0031, TryCatch #5 {Exception -> 0x0031, blocks: (B:4:0x0013, B:6:0x0026, B:8:0x002c, B:19:0x0063, B:21:0x007e, B:26:0x0058, B:43:0x0033), top: B:3:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #5 {Exception -> 0x0031, blocks: (B:4:0x0013, B:6:0x0026, B:8:0x002c, B:19:0x0063, B:21:0x007e, B:26:0x0058, B:43:0x0033), top: B:3:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap m123324q(List list, int i11, int i12) {
        byte[] bArr;
        Bitmap.CompressFormat compressFormat;
        ByteArrayOutputStream byteArrayOutputStream;
        AbstractC19074t.m100208f(list, "listPhotoAttachment");
        HashMap hashMap = new HashMap();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ReportPhotoAttachment reportPhotoAttachment = (ReportPhotoAttachment) list.get(i13);
                Bitmap m117968s = AbstractC23009a3.m117968s(reportPhotoAttachment.m50199b(), i11, i11);
                String str = "";
                C24848g0 c24848g0 = null;
                if (m117968s != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
                    } else {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    }
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            m117968s.compress(compressFormat, i12, byteArrayOutputStream);
                            m117968s.recycle();
                            bArr = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th2) {
                            th = th2;
                            bArr = null;
                        }
                        try {
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                AbstractC2933b.m13890a(byteArrayOutputStream, th);
                                throw th4;
                                break;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bArr = null;
                    }
                    try {
                        AbstractC2933b.m13890a(byteArrayOutputStream, null);
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC23350e.m122776f("[REPORT_V2]", e);
                        str = e.toString();
                        if (bArr != null) {
                        }
                        if (c24848g0 != null) {
                        }
                    }
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    C23493c c23493c = f114055a;
                    String m123308b = c23493c.m123308b(i13);
                    hashMap.put(reportPhotoAttachment.m50198a(), new C23967d(m123308b, bArr, "webp"));
                    c23493c.m123313l(i13, reportPhotoAttachment, bArr, m123308b);
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 != null) {
                    m123314n(i13, str);
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f("[REPORT_V2]", e13);
            }
        }
        return hashMap;
    }
}
