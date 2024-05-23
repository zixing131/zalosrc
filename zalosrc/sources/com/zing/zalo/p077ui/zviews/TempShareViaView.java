package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import af0.C0774b;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.TextView;
import ap0.C2279a;
import au.AbstractC2336a0;
import au.AbstractC2351i;
import b40.C2526d;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.TempShareViaView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import dj.C17961f1;
import dj.C17979l1;
import dj.C18013y0;
import fg0.ThreadFactoryC18928a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23078g6;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23224t9;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.C23793c;
import p207he.C20024r;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23994e;
import p379o3.C23995f;
import p386ob.EnumC24194e;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p560uw.EnumC27375b;
import p645xh.C29628e;
import p645xh.C29630g;
import p645xh.C29632i;
import p716zh.AbstractC32201z4;
import p716zh.C31849b1;
import p716zh.C31944h6;
import p716zh.C32063p6;
import p716zh.C32204z7;
import s00.AbstractC26080o;
import su.C26388b;
import sx.C26404f;
import sx.C26405g;
import th.AbstractC26684e;
import tv.AbstractC26897a;
import tv.C26898b;
import v50.C27870vb;
import ve.AbstractC27985d;
import vg.AbstractC28105j8;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class TempShareViaView extends ZaloView implements ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC0733x {

    /* renamed from: n1 */
    public static final String f78250n1 = "TempShareViaView";

    /* renamed from: B0 */
    private Uri f78252B0;

    /* renamed from: C0 */
    private String f78253C0;

    /* renamed from: D0 */
    private String f78254D0;

    /* renamed from: E0 */
    private String f78255E0;

    /* renamed from: F0 */
    private String f78256F0;

    /* renamed from: b1 */
    private HashMap f78278b1;

    /* renamed from: c1 */
    private ArrayList f78279c1;

    /* renamed from: e1 */
    private ArrayList f78281e1;

    /* renamed from: f1 */
    private ArrayList f78282f1;

    /* renamed from: k1 */
    private C23994e f78287k1;

    /* renamed from: l1 */
    private String f78288l1;

    /* renamed from: w0 */
    private TextView f78290w0;

    /* renamed from: x0 */
    private C23528a f78291x0;

    /* renamed from: y0 */
    private C15166d f78292y0;

    /* renamed from: z0 */
    private C26898b f78293z0;

    /* renamed from: A0 */
    private C27373c f78251A0 = null;

    /* renamed from: G0 */
    private boolean f78257G0 = false;

    /* renamed from: H0 */
    private boolean f78258H0 = false;

    /* renamed from: I0 */
    private boolean f78259I0 = false;

    /* renamed from: J0 */
    private boolean f78260J0 = false;

    /* renamed from: K0 */
    private boolean f78261K0 = false;

    /* renamed from: L0 */
    private boolean f78262L0 = false;

    /* renamed from: M0 */
    private boolean f78263M0 = false;

    /* renamed from: N0 */
    private boolean f78264N0 = false;

    /* renamed from: O0 */
    private String f78265O0 = "";

    /* renamed from: P0 */
    private boolean f78266P0 = false;

    /* renamed from: Q0 */
    private ContactProfile f78267Q0 = null;

    /* renamed from: R0 */
    private C26404f f78268R0 = null;

    /* renamed from: S0 */
    private boolean f78269S0 = false;

    /* renamed from: T0 */
    private final long f78270T0 = AbstractC23309i.m121231Nd() * 1048576;

    /* renamed from: U0 */
    private boolean f78271U0 = false;

    /* renamed from: V0 */
    private String f78272V0 = "";

    /* renamed from: W0 */
    private String f78273W0 = "";

    /* renamed from: X0 */
    private boolean f78274X0 = false;

    /* renamed from: Y0 */
    private boolean f78275Y0 = false;

    /* renamed from: Z0 */
    private boolean f78276Z0 = false;

    /* renamed from: a1 */
    private boolean f78277a1 = false;

    /* renamed from: d1 */
    private final List f78280d1 = Collections.synchronizedList(new ArrayList());

    /* renamed from: g1 */
    long f78283g1 = 0;

    /* renamed from: h1 */
    private ExecutorService f78284h1 = new ThreadPoolExecutor(0, 1, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("TempShareVia-A"));

    /* renamed from: i1 */
    private final Object f78285i1 = new Object();

    /* renamed from: j1 */
    public String f78286j1 = "";

    /* renamed from: m1 */
    private int f78289m1 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TempShareViaView$a */
    /* loaded from: classes6.dex */
    public class C15163a extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ File f78294v0;

        /* renamed from: w0 */
        final /* synthetic */ Uri f78295w0;

        C15163a(File file, Uri uri) {
            this.f78294v0 = file;
            this.f78295w0 = uri;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            if (TempShareViaView.this.f88762c0.m92677nJ()) {
                return;
            }
            boolean z11 = false;
            if (file != null && file.exists() && c23995f.m125657h() == 200) {
                String str2 = TempShareViaView.f78250n1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("download done:");
                sb2.append(file);
                String absolutePath = this.f78294v0.getAbsolutePath();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[50];
                        if (fileInputStream.read(bArr, 0, 50) > 0 && AbstractC23258x2.m119947f(bArr)) {
                            z11 = true;
                        }
                        if (z11) {
                            File file2 = new File(AbstractC20130d.m104905y(), AbstractC23352g.m122788d(absolutePath) + ".gif");
                            if (AbstractC23238v2.m119718c(this.f78294v0, file2)) {
                                absolutePath = file2.getAbsolutePath();
                            }
                        }
                        fileInputStream.close();
                    } finally {
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                if (!z11 && !TempShareViaView.this.m85028ML(absolutePath)) {
                    TempShareViaView.this.m85105FL(absolutePath, this.f78295w0);
                    return;
                }
                TempShareViaView tempShareViaView = TempShareViaView.this;
                tempShareViaView.f78286j1 = absolutePath;
                if (!tempShareViaView.f78259I0) {
                    if (TempShareViaView.this.m85026LL()) {
                        TempShareViaView.this.f78278b1.put(this.f78295w0, Boolean.TRUE);
                        TempShareViaView.this.f78280d1.add(absolutePath);
                    }
                    TempShareViaView.this.m85098vM();
                    return;
                }
                return;
            }
            if (c23995f.m125657h() == -10002) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                TempShareViaView.this.finish();
                return;
            }
            String str3 = TempShareViaView.f78250n1;
            if (c23995f.m125657h() == 200 && c23995f.m125668s() == -1001) {
                ToastUtils.m89273u();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
            }
            TempShareViaView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TempShareViaView$b */
    /* loaded from: classes6.dex */
    public class C15164b implements C32204z7.h {
        C15164b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m85108e(C18013y0 c18013y0) {
            if (!TempShareViaView.this.m92677nJ() && TempShareViaView.this.m92674mJ() && !TempShareViaView.this.m92681pJ()) {
                C26405g c26405g = new C26405g(c18013y0, true);
                if (TempShareViaView.this.f78268R0.m136159l() == 2) {
                    TempShareViaView.this.f78268R0 = new C26404f(4);
                    TempShareViaView.this.f78268R0.m136170w(c26405g);
                    if (!TextUtils.isEmpty(TempShareViaView.this.f78254D0) && C31944h6.m153558z(TempShareViaView.this.f78254D0)) {
                        TempShareViaView.this.f78268R0.m136172y(TempShareViaView.this.f78254D0);
                    } else {
                        TempShareViaView.this.f78268R0.m136172y(TempShareViaView.this.f78255E0);
                    }
                    TempShareViaView tempShareViaView = TempShareViaView.this;
                    tempShareViaView.m85082nM(tempShareViaView.f78268R0, TempShareViaView.this.f78267Q0);
                }
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            if (!TempShareViaView.this.m92677nJ() && TempShareViaView.this.m92674mJ() && !TempShareViaView.this.m92681pJ()) {
                TempShareViaView tempShareViaView = TempShareViaView.this;
                tempShareViaView.m85082nM(tempShareViaView.f78268R0, TempShareViaView.this.f78267Q0);
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, final C18013y0 c18013y0) {
            try {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ir0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TempShareViaView.C15164b.this.m85108e(c18013y0);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TempShareViaView$c */
    /* loaded from: classes6.dex */
    public class RunnableC15165c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Uri f78298p;

        RunnableC15165c(Uri uri) {
            this.f78298p = uri;
        }

        /* renamed from: a */
        void m85109a(String str) {
            if (str != null) {
                if (TempShareViaView.this.f78281e1 == null) {
                    TempShareViaView.this.f78281e1 = new ArrayList();
                }
                TempShareViaView.this.f78281e1.add(str);
            }
            TempShareViaView tempShareViaView = TempShareViaView.this;
            tempShareViaView.f78289m1--;
            if (TempShareViaView.this.f78289m1 == 0 && !TempShareViaView.this.f78259I0) {
                if (TempShareViaView.this.f78281e1 != null && !TempShareViaView.this.f78281e1.isEmpty()) {
                    TempShareViaView.this.m85096uM();
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
                    TempShareViaView.this.finish();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x0226, code lost:            if (r7 == null) goto L133;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x021a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:539), block:B:174:0x0219 */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00ea A[Catch: all -> 0x00e1, Exception -> 0x00e5, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:4:0x0005, B:7:0x001b, B:13:0x00ea, B:14:0x00f3, B:16:0x00f9, B:18:0x0101, B:22:0x0113, B:24:0x011d, B:26:0x0127, B:29:0x014e, B:31:0x0154, B:33:0x015e, B:34:0x0167, B:37:0x016e, B:40:0x0180, B:43:0x0196, B:45:0x019c, B:46:0x01d3, B:48:0x01e2, B:50:0x01e5, B:93:0x01b0, B:94:0x01b6, B:98:0x01bc, B:102:0x0249, B:103:0x0187, B:151:0x00dd, B:158:0x00f0, B:152:0x00e0), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f9 A[Catch: all -> 0x00e1, Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:4:0x0005, B:14:0x00f3, B:16:0x00f9, B:18:0x0101, B:22:0x0113, B:24:0x011d, B:26:0x0127, B:29:0x014e, B:31:0x0154, B:33:0x015e, B:34:0x0167, B:37:0x016e, B:40:0x0180, B:43:0x0196, B:45:0x019c, B:46:0x01d3, B:48:0x01e2, B:50:0x01e5, B:93:0x01b0, B:94:0x01b6, B:98:0x01bc, B:102:0x0249, B:103:0x0187, B:158:0x00f0), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x011d A[Catch: all -> 0x00e1, Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:4:0x0005, B:14:0x00f3, B:16:0x00f9, B:18:0x0101, B:22:0x0113, B:24:0x011d, B:26:0x0127, B:29:0x014e, B:31:0x0154, B:33:0x015e, B:34:0x0167, B:37:0x016e, B:40:0x0180, B:43:0x0196, B:45:0x019c, B:46:0x01d3, B:48:0x01e2, B:50:0x01e5, B:93:0x01b0, B:94:0x01b6, B:98:0x01bc, B:102:0x0249, B:103:0x0187, B:158:0x00f0), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0154 A[Catch: all -> 0x00e1, Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:4:0x0005, B:14:0x00f3, B:16:0x00f9, B:18:0x0101, B:22:0x0113, B:24:0x011d, B:26:0x0127, B:29:0x014e, B:31:0x0154, B:33:0x015e, B:34:0x0167, B:37:0x016e, B:40:0x0180, B:43:0x0196, B:45:0x019c, B:46:0x01d3, B:48:0x01e2, B:50:0x01e5, B:93:0x01b0, B:94:0x01b6, B:98:0x01bc, B:102:0x0249, B:103:0x0187, B:158:0x00f0), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x016e A[Catch: all -> 0x00e1, Exception -> 0x010f, TRY_ENTER, TryCatch #0 {Exception -> 0x010f, blocks: (B:4:0x0005, B:14:0x00f3, B:16:0x00f9, B:18:0x0101, B:22:0x0113, B:24:0x011d, B:26:0x0127, B:29:0x014e, B:31:0x0154, B:33:0x015e, B:34:0x0167, B:37:0x016e, B:40:0x0180, B:43:0x0196, B:45:0x019c, B:46:0x01d3, B:48:0x01e2, B:50:0x01e5, B:93:0x01b0, B:94:0x01b6, B:98:0x01bc, B:102:0x0249, B:103:0x0187, B:158:0x00f0), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0243 A[Catch: all -> 0x0218, Exception -> 0x021c, TRY_ENTER, TryCatch #9 {Exception -> 0x021c, blocks: (B:60:0x0214, B:61:0x0229, B:78:0x0243, B:79:0x0246), top: B:49:0x01e5 }] */
        /* JADX WARN: Type inference failed for: r13v3, types: [android.net.Uri] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStream] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Throwable th2;
            InputStream inputStream;
            ?? r62;
            IOException iOException;
            String str;
            String type;
            String str2;
            long j11;
            String m118212k;
            BufferedOutputStream bufferedOutputStream;
            Cursor m135984j;
            Throwable th3;
            long j12;
            InputStream inputStream2 = null;
            long j13 = -1;
            try {
                try {
                    try {
                        str = "";
                        type = MainApplication.getAppContext().getContentResolver().getType(this.f78298p);
                        str2 = "";
                        try {
                            Context appContext = MainApplication.getAppContext();
                            ?? r13 = this.f78298p;
                            m135984j = C26388b.m135984j(appContext, r13, new String[]{"_display_name", "title", "_size", "mime_type", "_id", "_data"}, null, null, null, false);
                            try {
                            } catch (Exception e11) {
                                e = e11;
                                j11 = r13;
                                AbstractC20110a.m104539h(e);
                                if (TextUtils.isEmpty(str)) {
                                }
                                if (TempShareViaView.this.f78270T0 <= 0) {
                                }
                                if (!AbstractC23238v2.m119727l()) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            j11 = 0;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e13) {
                                AbstractC23350e.m122776f(TempShareViaView.f78250n1, e13);
                            }
                        }
                        AbstractC32201z4.m155250k(-1L);
                        throw th2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r62 = 0;
                }
                if (m135984j != null) {
                    try {
                        if (m135984j.moveToFirst()) {
                            int columnCount = m135984j.getColumnCount();
                            int columnIndex = m135984j.getColumnIndex("_display_name");
                            if (columnIndex >= 0 && columnIndex < columnCount && (str = m135984j.getString(columnIndex)) == null) {
                                str = "";
                            }
                            int columnIndex2 = m135984j.getColumnIndex("title");
                            if (str.isEmpty() && columnIndex2 >= 0 && columnIndex2 < columnCount && (str = m135984j.getString(columnIndex2)) == null) {
                                str = "";
                            }
                            int columnIndex3 = m135984j.getColumnIndex("_id");
                            int columnIndex4 = m135984j.getColumnIndex("_data");
                            if (columnIndex3 >= 0 && columnIndex3 < columnCount && columnIndex4 >= 0 && columnIndex4 < columnCount) {
                                String m118212k2 = AbstractC23041d2.m118212k(AbstractC23280z4.m120357v(m135984j, this.f78298p, columnIndex3, columnIndex4));
                                if (!m118212k2.isEmpty()) {
                                    if (str.isEmpty()) {
                                        str = m118212k2;
                                    }
                                    str2 = AbstractC23041d2.m118222u(m118212k2, true, false);
                                }
                            }
                            int columnIndex5 = m135984j.getColumnIndex("_size");
                            if (columnIndex5 >= 0 && columnIndex5 < columnCount) {
                                j12 = m135984j.getLong(columnIndex5);
                            } else {
                                j12 = 0;
                            }
                            try {
                                int columnIndex6 = m135984j.getColumnIndex("mime_type");
                                j11 = j12;
                                j11 = j12;
                                if (columnIndex6 >= 0 && columnIndex6 < columnCount) {
                                    type = m135984j.getString(columnIndex6);
                                    j11 = j12;
                                }
                                if (m135984j != null) {
                                    m135984j.close();
                                }
                                if (TextUtils.isEmpty(str) && str.contains("../")) {
                                    ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                                    m85109a(null);
                                    AbstractC32201z4.m155250k(-1L);
                                    return;
                                }
                                if (TempShareViaView.this.f78270T0 <= 0 && j11 > TempShareViaView.this.f78270T0) {
                                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit), AbstractC23041d2.m118213l(TempShareViaView.this.f78270T0)));
                                    TempShareViaView.this.f78276Z0 = true;
                                    m85109a(null);
                                    AbstractC32201z4.m155250k(-1L);
                                    return;
                                }
                                if (!AbstractC23238v2.m119727l()) {
                                    if (TempShareViaView.this.f88762c0.m92672lJ()) {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.sd_card_not_available));
                                    }
                                    m85109a(null);
                                    AbstractC32201z4.m155250k(-1L);
                                    return;
                                }
                                String m104825D = AbstractC20130d.m104825D();
                                String m85015CL = TempShareViaView.this.m85015CL(type, str);
                                if (!m85015CL.isEmpty()) {
                                    str2 = m85015CL;
                                }
                                if (!str.endsWith(str2)) {
                                    str = str + str2;
                                }
                                if (str.isEmpty()) {
                                    m118212k = AbstractC32201z4.m155245f() + str2;
                                } else {
                                    synchronized (TempShareViaView.this.f78285i1) {
                                        j13 = System.nanoTime();
                                    }
                                    m118212k = AbstractC23041d2.m118212k(AbstractC32201z4.m155241b(j13, m104825D + str));
                                }
                                r62 = AbstractC20130d.m104825D();
                                File file = new File((String) r62, m118212k);
                                if (!file.delete()) {
                                    file.deleteOnExit();
                                }
                                try {
                                    InputStream openInputStream = TempShareViaView.this.f88762c0.m92648SI().getContentResolver().openInputStream(this.f78298p);
                                    try {
                                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                                    } catch (Exception e15) {
                                        e = e15;
                                        bufferedOutputStream = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        bufferedOutputStream = null;
                                        if (bufferedOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int read = openInputStream.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                } else {
                                                    bufferedOutputStream.write(bArr, 0, read);
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            if (bufferedOutputStream != null) {
                                                bufferedOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        e.printStackTrace();
                                    }
                                    bufferedOutputStream.close();
                                    m85109a(file.getAbsolutePath());
                                    if (openInputStream != null) {
                                        try {
                                            openInputStream.close();
                                        } catch (IOException e17) {
                                            iOException = e17;
                                            AbstractC23350e.m122776f(TempShareViaView.f78250n1, iOException);
                                            AbstractC32201z4.m155250k(j13);
                                            return;
                                        }
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    AbstractC23350e.m122776f(TempShareViaView.f78250n1, e);
                                    m85109a(null);
                                    if (r62 != 0) {
                                        try {
                                            r62.close();
                                        } catch (IOException e19) {
                                            iOException = e19;
                                            AbstractC23350e.m122776f(TempShareViaView.f78250n1, iOException);
                                            AbstractC32201z4.m155250k(j13);
                                            return;
                                        }
                                    }
                                    AbstractC32201z4.m155250k(j13);
                                    return;
                                }
                                AbstractC32201z4.m155250k(j13);
                                return;
                            } catch (Throwable th7) {
                                th3 = th7;
                                try {
                                    m135984j.close();
                                    throw th3;
                                } catch (Throwable th8) {
                                    th3.addSuppressed(th8);
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th3 = th9;
                    }
                }
                j11 = 0;
                if (m135984j != null) {
                }
                if (TextUtils.isEmpty(str)) {
                }
                if (TempShareViaView.this.f78270T0 <= 0) {
                }
                if (!AbstractC23238v2.m119727l()) {
                }
            } catch (Throwable th10) {
                th2 = th10;
                inputStream2 = inputStream;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TempShareViaView$d */
    /* loaded from: classes6.dex */
    private class C15166d extends BroadcastReceiver {
        public C15166d(Context context) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.media.metadata.VIDEO_PREVIEW_METADATA_ON_LOAD_FINISHED");
            AbstractC2351i.m12327a(context, this, intentFilter, true);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action)) {
                    try {
                        if (action.equals("com.zing.zalo.media.metadata.VIDEO_PREVIEW_METADATA_ON_LOAD_FINISHED") && TempShareViaView.this.f88762c0.m92676n2() != null) {
                            InterfaceC27218a m92676n2 = TempShareViaView.this.f88762c0.m92676n2();
                            final TempShareViaView tempShareViaView = TempShareViaView.this;
                            m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jr0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TempShareViaView.this.m85066fM();
                                }
                            });
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
        }
    }

    /* renamed from: AL */
    private void m85013AL(final Uri uri) {
        try {
            TextView textView = this.f78290w0;
            if (textView != null) {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.loading_photo_from_server));
            }
            this.f78284h1.execute(new Runnable() { // from class: com.zing.zalo.ui.zviews.xq0
                @Override // java.lang.Runnable
                public final void run() {
                    TempShareViaView.this.m85032OL(uri);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78250n1, e11);
        }
    }

    /* renamed from: BL */
    private void m85014BL(Uri uri) {
        String str;
        boolean z11;
        String m119855c = AbstractC23254w8.m119855c(this.f88762c0.m92648SI(), uri);
        if (m119855c == null) {
            m119855c = uri.toString();
        }
        TextView textView = this.f78290w0;
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.loading_photo_from_server));
        }
        File file = new File(AbstractC20130d.m104905y(), AbstractC23352g.m122788d(m119855c) + ".jpg");
        File file2 = new File(AbstractC20130d.m104905y(), AbstractC23352g.m122788d(m119855c) + ".gif");
        if (file.exists() && file.length() > 0) {
            str = file.getAbsolutePath();
            z11 = true;
        } else {
            if (file2.exists() && file2.length() > 0) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (z11 && !m85028ML(str)) {
                m85105FL(str, uri);
                return;
            }
            this.f78286j1 = str;
            if (!this.f78259I0) {
                if (m85026LL()) {
                    this.f78278b1.put(uri, Boolean.TRUE);
                    this.f78280d1.add(str);
                }
                m85098vM();
                return;
            }
            return;
        }
        AbstractC23041d2.m118207f(file);
        AbstractC23041d2.m118207f(file2);
        if (this.f78287k1 == null) {
            this.f78287k1 = new C15163a(file, uri);
        }
        this.f78291x0.m123600e(m119855c, file, this.f78287k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:            if (r1.length() < r5.length()) goto L10;     */
    /* renamed from: CL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m85015CL(String str, String str2) {
        String str3;
        if (str2 != null && !str2.isEmpty()) {
            str3 = str2.substring(str2.lastIndexOf(".") + 1);
        }
        str3 = null;
        if (str3 == null) {
            str3 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        if (str3 != null && !str3.isEmpty()) {
            return "." + str3;
        }
        return "";
    }

    /* renamed from: DL */
    private String m85016DL(String str) {
        String str2 = "";
        if (!C8937j0.m47663l("phonebook_query_synced_contact_via_intent")) {
            return "";
        }
        SensitiveData sensitiveData = new SensitiveData("phonebook_query_synced_contact_via_intent", "external_intent");
        try {
            C8937j0.m47661j().m50393d(sensitiveData);
            Cursor m135984j = C26388b.m135984j(MainApplication.getAppContext(), Uri.parse(str), null, null, null, null, true);
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            if (m135984j != null) {
                if (m135984j.moveToFirst()) {
                    String string = m135984j.getString(m135984j.getColumnIndexOrThrow("DATA4"));
                    if (TextUtils.isEmpty(string)) {
                        str2 = m135984j.getString(m135984j.getColumnIndexOrThrow("DATA1"));
                    } else if (Integer.parseInt(string) == 1) {
                        str2 = String.valueOf(AbstractC2336a0.m12292a(Long.parseLong(m135984j.getString(m135984j.getColumnIndexOrThrow("DATA1")))));
                    }
                }
                m135984j.close();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:            if (new java.io.File(r1).exists() != false) goto L19;     */
    /* renamed from: EL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m85017EL(Uri uri) {
        this.f78257G0 = true;
        if (AbstractC23309i.m122425tb() != 2) {
            ToastUtils.m89266n(AbstractC8020f0.video_receiver_proxy_feature_not_enable, new Object[0]);
            finish();
            return;
        }
        try {
            final String m119855c = AbstractC23254w8.m119855c(this.f88762c0.m92648SI(), uri);
            if (!TextUtils.isEmpty(m119855c)) {
                if (!m119855c.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString())) {
                    if (!m119855c.toLowerCase().endsWith(".mp4")) {
                        if (m119855c.toLowerCase().endsWith(".3gp")) {
                        }
                    }
                }
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.hr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TempShareViaView.this.m85034PL(m119855c);
                    }
                });
                return;
            }
            if (uri.getScheme() != null && uri.getScheme().equals("content")) {
                this.f78258H0 = true;
                m85076kM(uri, false);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.video_receiver_proxy_stream_source_not_support, new Object[0]);
                finish();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f78250n1, e11.toString());
            ToastUtils.m89266n(AbstractC8020f0.video_receiver_proxy_stream_source_not_support, new Object[0]);
            finish();
        }
    }

    /* renamed from: GL */
    private boolean m85018GL(Bundle bundle) {
        boolean z11;
        String str;
        ArrayList arrayList;
        if (bundle == null) {
            return false;
        }
        if (bundle.containsKey("fromDirectShare")) {
            boolean z12 = bundle.getBoolean("fromDirectShare");
            this.f78266P0 = z12;
            if (z12 && !AbstractC23224t9.m119694i(bundle)) {
                return false;
            }
        }
        String string = bundle.getString("userId");
        if (!TextUtils.isEmpty(string)) {
            String string2 = bundle.getString("displayname");
            String string3 = bundle.getString("avatar");
            ContactProfile contactProfile = new ContactProfile();
            this.f78267Q0 = contactProfile;
            contactProfile.f42434r = string;
            if (!TextUtils.isEmpty(string2)) {
                this.f78267Q0.f42437s = string2;
            }
            if (!TextUtils.isEmpty(string3)) {
                this.f78267Q0.f42446v = string3;
            }
        }
        if (bundle.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f78275Y0 = z11;
        this.f78265O0 = bundle.getString("token");
        this.f78263M0 = bundle.getBoolean("backToSource", false);
        this.f78264N0 = bundle.getBoolean("autoBack2S", false);
        this.f78256F0 = bundle.getString("intent_type");
        String string4 = bundle.getString("intent_action");
        if (!TextUtils.isEmpty(this.f78256F0) && this.f78256F0.equals("image/gif") && !AbstractC23309i.m121792ch()) {
            this.f78269S0 = true;
            return false;
        }
        this.f78277a1 = bundle.getBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", false);
        if (!"android.intent.action.SEND".equals(string4) && !"com.zing.zalo.intent.action.SEND".equals(string4)) {
            if ("android.intent.action.SEND_MULTIPLE".equals(string4) && bundle.containsKey("android.intent.extra.STREAM")) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("android.intent.extra.STREAM");
                if (parcelableArrayList == null) {
                    return false;
                }
                String str2 = this.f78256F0;
                this.f78278b1 = new HashMap();
                int m4306w3 = AbstractC0924m0.m4306w3();
                Iterator it = parcelableArrayList.iterator();
                boolean z13 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Parcelable parcelable = (Parcelable) it.next();
                    HashMap hashMap = this.f78278b1;
                    if (hashMap != null && hashMap.size() >= m4306w3) {
                        ToastUtils.showMess(String.format(m92652XI(AbstractC8020f0.str_uploadphoto_reachlimit), Integer.valueOf(m4306w3)));
                        break;
                    }
                    m85097vL(str2, (Uri) parcelable, true);
                    if (this.f78256F0.equals("*/*")) {
                        z13 = true;
                    }
                }
                if (z13 || ((arrayList = this.f78279c1) != null && arrayList.size() > 1 && !this.f78256F0.startsWith("image/"))) {
                    this.f78256F0 = "*/*";
                }
                return true;
            }
            if (AbstractC23059e9.m118344w(string4, this.f78256F0) && AbstractC23112j7.m118502L(string4, this.f78256F0)) {
                this.f78271U0 = true;
                if (bundle.containsKey("data_uri_from_intent")) {
                    this.f78272V0 = bundle.getString("data_uri_from_intent");
                }
                return true;
            }
        } else {
            if (bundle.containsKey("android.intent.extra.STREAM")) {
                m85097vL(this.f78256F0, (Uri) bundle.getParcelable("android.intent.extra.STREAM"), false);
                this.f78260J0 = bundle.getBoolean("bol_share_in_app", false);
                if (bundle.containsKey("android.intent.extra.TEXT")) {
                    this.f78253C0 = bundle.getString("android.intent.extra.TEXT");
                }
                this.f78261K0 = bundle.getBoolean("postFeed", false);
                return true;
            }
            if (bundle.containsKey("android.intent.extra.TEXT")) {
                this.f78254D0 = bundle.getString("android.intent.extra.TEXT");
                if (!bundle.containsKey("android.intent.extra.SUBJECT")) {
                    str = "";
                } else {
                    str = bundle.getString("android.intent.extra.SUBJECT");
                }
                this.f78255E0 = str;
                this.f78260J0 = bundle.getBoolean("bol_share_in_app", false);
                this.f78261K0 = bundle.getBoolean("postFeed", false);
                this.f78262L0 = bundle.getBoolean("hidePostFeed", false);
                if (this.f78255E0 == null) {
                    this.f78255E0 = "";
                }
                if (this.f78254D0 == null) {
                    this.f78254D0 = "";
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: HL */
    private void m85019HL() {
        if (!TextUtils.isEmpty(this.f78272V0)) {
            Context m92648SI = this.f88762c0.m92648SI();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                AbstractC23034c6.m118184v0(this, strArr, 108);
                this.f78274X0 = true;
                return;
            }
            this.f78274X0 = false;
            String m85016DL = m85016DL(this.f78272V0);
            if (!TextUtils.isEmpty(m85016DL)) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(m85016DL);
                this.f78267Q0 = m141809c;
                if (m141809c == null) {
                    this.f78267Q0 = new ContactProfile(m85016DL);
                }
                if (this.f78256F0.equals(C31849b1.f146225i)) {
                    m85084oM(this.f78267Q0);
                    return;
                }
                if (this.f78256F0.equals(C31849b1.f146224h)) {
                    m85062dM();
                    AbstractC23647d.m123906p("400303");
                    AbstractC23647d.m123893c();
                    return;
                } else {
                    if (this.f78256F0.equals(C31849b1.f146226j)) {
                        m85064eM();
                        AbstractC23647d.m123906p("400304");
                        AbstractC23647d.m123893c();
                        return;
                    }
                    return;
                }
            }
            this.f78273W0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
            throw new IllegalArgumentException(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
        this.f78273W0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
        throw new IllegalArgumentException(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
    }

    /* renamed from: IL */
    private void m85020IL(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("EXTRA_VIDEO_INFO")) {
                    C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                    this.f78251A0 = c27373c;
                    C26404f c26404f = this.f78268R0;
                    if (c26404f != null && c27373c != null) {
                        c26404f.m136173z(c27373c);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f78293z0 = null;
        finish();
    }

    /* renamed from: JL */
    private void m85022JL() {
        try {
            AbstractC23304d.m120534e();
            AbstractC28105j8.m141584f(MainApplication.getAppContext());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KL */
    private void m85024KL(View view) {
        try {
            this.f78291x0 = new C23528a(this.f88762c0.m92648SI());
            this.f78290w0 = (TextView) view.findViewById(AbstractC6918a0.tv_loading);
            ((Button) view.findViewById(AbstractC6918a0.btn_cancel)).setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public boolean m85026LL() {
        HashMap hashMap = this.f78278b1;
        if (hashMap != null && hashMap.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ML */
    public boolean m85028ML(String str) {
        Bitmap m117961l = AbstractC23009a3.m117961l(str);
        if (m117961l != null) {
            if (!m117961l.isRecycled()) {
                m117961l.recycle();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5 A[Catch: all -> 0x00ea, Exception -> 0x00ef, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ef, blocks: (B:15:0x00f5, B:136:0x00e6, B:137:0x00e9), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109 A[Catch: all -> 0x00ea, Exception -> 0x011f, TryCatch #3 {all -> 0x00ea, blocks: (B:4:0x0011, B:7:0x0024, B:10:0x004f, B:15:0x00f5, B:16:0x0103, B:18:0x0109, B:20:0x0111, B:25:0x0125, B:29:0x012f, B:32:0x0152, B:34:0x0158, B:36:0x0160, B:37:0x0169, B:40:0x0170, B:43:0x0180, B:46:0x0196, B:48:0x019c, B:49:0x01cf, B:79:0x01b0, B:80:0x01b2, B:84:0x01b8, B:88:0x0235, B:89:0x0187, B:136:0x00e6, B:143:0x0100, B:137:0x00e9), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125 A[Catch: all -> 0x00ea, Exception -> 0x011f, TRY_ENTER, TryCatch #3 {all -> 0x00ea, blocks: (B:4:0x0011, B:7:0x0024, B:10:0x004f, B:15:0x00f5, B:16:0x0103, B:18:0x0109, B:20:0x0111, B:25:0x0125, B:29:0x012f, B:32:0x0152, B:34:0x0158, B:36:0x0160, B:37:0x0169, B:40:0x0170, B:43:0x0180, B:46:0x0196, B:48:0x019c, B:49:0x01cf, B:79:0x01b0, B:80:0x01b2, B:84:0x01b8, B:88:0x0235, B:89:0x0187, B:136:0x00e6, B:143:0x0100, B:137:0x00e9), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158 A[Catch: all -> 0x00ea, Exception -> 0x011f, TryCatch #3 {all -> 0x00ea, blocks: (B:4:0x0011, B:7:0x0024, B:10:0x004f, B:15:0x00f5, B:16:0x0103, B:18:0x0109, B:20:0x0111, B:25:0x0125, B:29:0x012f, B:32:0x0152, B:34:0x0158, B:36:0x0160, B:37:0x0169, B:40:0x0170, B:43:0x0180, B:46:0x0196, B:48:0x019c, B:49:0x01cf, B:79:0x01b0, B:80:0x01b2, B:84:0x01b8, B:88:0x0235, B:89:0x0187, B:136:0x00e6, B:143:0x0100, B:137:0x00e9), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170 A[Catch: all -> 0x00ea, Exception -> 0x011f, TRY_ENTER, TryCatch #3 {all -> 0x00ea, blocks: (B:4:0x0011, B:7:0x0024, B:10:0x004f, B:15:0x00f5, B:16:0x0103, B:18:0x0109, B:20:0x0111, B:25:0x0125, B:29:0x012f, B:32:0x0152, B:34:0x0158, B:36:0x0160, B:37:0x0169, B:40:0x0170, B:43:0x0180, B:46:0x0196, B:48:0x019c, B:49:0x01cf, B:79:0x01b0, B:80:0x01b2, B:84:0x01b8, B:88:0x0235, B:89:0x0187, B:136:0x00e6, B:143:0x0100, B:137:0x00e9), top: B:3:0x0011 }] */
    /* renamed from: NL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m85030NL(Uri uri, boolean z11) {
        Throwable th2;
        InputStream inputStream;
        IOException iOException;
        String str;
        String type;
        String str2;
        int i11;
        long j11;
        String m118212k;
        Uri uri2;
        Cursor m135984j;
        Throwable th3;
        long j12;
        this.f78283g1 = C23793c.m124316k().mo124319c();
        long j13 = -1;
        try {
        } catch (Throwable th4) {
            th2 = th4;
        }
        try {
            try {
                str = "";
                type = MainApplication.getAppContext().getContentResolver().getType(uri);
                str2 = "";
                try {
                    uri2 = uri;
                    i11 = 1;
                    try {
                        m135984j = C26388b.m135984j(MainApplication.getAppContext(), uri2, new String[]{"_display_name", "title", "_size", "mime_type", "_id", "_data"}, null, null, null, false);
                    } catch (Exception e11) {
                        e = e11;
                        j11 = 0;
                        AbstractC20110a.m104539h(e);
                        if (TextUtils.isEmpty(str)) {
                        }
                        if (z11) {
                        }
                        if (AbstractC23238v2.m119727l()) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i11 = 1;
                }
                try {
                } catch (Exception e13) {
                    e = e13;
                    j11 = uri2;
                    AbstractC20110a.m104539h(e);
                    if (TextUtils.isEmpty(str)) {
                    }
                    if (z11) {
                    }
                    if (AbstractC23238v2.m119727l()) {
                    }
                }
            } catch (Exception e14) {
                e = e14;
                inputStream = null;
            }
            if (m135984j != null) {
                try {
                    if (m135984j.moveToFirst()) {
                        int columnCount = m135984j.getColumnCount();
                        int columnIndex = m135984j.getColumnIndex("_display_name");
                        if (columnIndex >= 0 && columnIndex < columnCount && (str = m135984j.getString(columnIndex)) == null) {
                            str = "";
                        }
                        int columnIndex2 = m135984j.getColumnIndex("title");
                        if (str.isEmpty() && columnIndex2 >= 0 && columnIndex2 < columnCount && (str = m135984j.getString(columnIndex2)) == null) {
                            str = "";
                        }
                        int columnIndex3 = m135984j.getColumnIndex("_id");
                        int columnIndex4 = m135984j.getColumnIndex("_data");
                        if (columnIndex3 >= 0 && columnIndex3 < columnCount && columnIndex4 >= 0 && columnIndex4 < columnCount) {
                            String m118212k2 = AbstractC23041d2.m118212k(AbstractC23280z4.m120357v(m135984j, uri, columnIndex3, columnIndex4));
                            if (!m118212k2.isEmpty()) {
                                if (str.isEmpty()) {
                                    str = m118212k2;
                                }
                                str2 = AbstractC23041d2.m118222u(m118212k2, true, false);
                            }
                        }
                        int columnIndex5 = m135984j.getColumnIndex("_size");
                        if (columnIndex5 >= 0 && columnIndex5 < columnCount) {
                            j12 = m135984j.getLong(columnIndex5);
                        } else {
                            j12 = 0;
                        }
                        try {
                            int columnIndex6 = m135984j.getColumnIndex("mime_type");
                            j11 = j12;
                            j11 = j12;
                            if (columnIndex6 >= 0 && columnIndex6 < columnCount) {
                                type = m135984j.getString(columnIndex6);
                                j11 = j12;
                            }
                            if (m135984j != null) {
                                m135984j.close();
                            }
                            if (TextUtils.isEmpty(str) && str.contains("../")) {
                                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                                finish();
                                AbstractC32201z4.m155250k(-1L);
                                return;
                            }
                            if (z11) {
                                long j14 = this.f78270T0;
                                if (j14 > 0 && j11 > j14) {
                                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit);
                                    Object[] objArr = new Object[i11];
                                    objArr[0] = AbstractC23041d2.m118213l(this.f78270T0);
                                    ToastUtils.showMess(String.format(m118743r0, objArr));
                                    C2526d.f10270a.m12706c(j11, 0);
                                    finish();
                                    AbstractC32201z4.m155250k(-1L);
                                    return;
                                }
                            }
                            if (AbstractC23238v2.m119727l()) {
                                if (this.f88762c0.m92672lJ()) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.sd_card_not_available));
                                }
                                finish();
                                AbstractC32201z4.m155250k(-1L);
                                return;
                            }
                            String m104825D = AbstractC20130d.m104825D();
                            String m85015CL = m85015CL(type, str);
                            if (m85015CL.isEmpty()) {
                                m85015CL = str2;
                            }
                            if (!str.endsWith(m85015CL)) {
                                str = str + m85015CL;
                            }
                            if (str.isEmpty()) {
                                m118212k = AbstractC32201z4.m155245f() + m85015CL;
                            } else {
                                synchronized (this.f78285i1) {
                                    j13 = System.nanoTime();
                                }
                                m118212k = AbstractC23041d2.m118212k(AbstractC32201z4.m155241b(j13, m104825D + str));
                            }
                            File file = new File(m104825D, m118212k);
                            file.delete();
                            inputStream = this.f88762c0.m92648SI().getContentResolver().openInputStream(uri);
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                }
                                bufferedOutputStream.close();
                                this.f78288l1 = file.getAbsolutePath();
                                if (!this.f78259I0) {
                                    if (this.f78258H0) {
                                        m85072iM(new C20556f(file.getAbsolutePath()));
                                    } else {
                                        m85096uM();
                                    }
                                }
                            } catch (Exception e15) {
                                e = e15;
                                AbstractC23350e.m122776f(f78250n1, e);
                                ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
                                finish();
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e16) {
                                        iOException = e16;
                                        AbstractC23350e.m122776f(f78250n1, iOException);
                                        AbstractC32201z4.m155250k(j13);
                                        return;
                                    }
                                }
                                AbstractC32201z4.m155250k(j13);
                                return;
                            }
                            try {
                                inputStream.close();
                            } catch (IOException e17) {
                                iOException = e17;
                                AbstractC23350e.m122776f(f78250n1, iOException);
                                AbstractC32201z4.m155250k(j13);
                                return;
                            }
                            AbstractC32201z4.m155250k(j13);
                            return;
                        } catch (Throwable th5) {
                            th3 = th5;
                            try {
                                m135984j.close();
                                throw th3;
                            } catch (Throwable th6) {
                                th3.addSuppressed(th6);
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            j11 = 0;
            if (m135984j != null) {
            }
            if (TextUtils.isEmpty(str)) {
            }
            if (z11) {
            }
            if (AbstractC23238v2.m119727l()) {
            }
        } catch (Throwable th8) {
            th2 = th8;
            InputStream inputStream2 = null;
            if (0 != 0) {
                try {
                    inputStream2.close();
                } catch (IOException e18) {
                    AbstractC23350e.m122776f(f78250n1, e18);
                }
            }
            AbstractC32201z4.m155250k(-1L);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018a A[Catch: IOException -> 0x0159, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0159, blocks: (B:50:0x0155, B:73:0x018a, B:25:0x00b2, B:27:0x00b8, B:29:0x00c0, B:30:0x00d0, B:32:0x00d4, B:33:0x00f1, B:36:0x00fa, B:38:0x00ff, B:41:0x0103, B:43:0x010c, B:45:0x012a, B:47:0x0130, B:49:0x0136, B:52:0x013a, B:54:0x0140, B:56:0x0146, B:57:0x0152), top: B:24:0x00b2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: OL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m85032OL(Uri uri) {
        String str;
        boolean z11;
        InputStream inputStream = null;
        String m122788d = AbstractC23352g.m122788d(uri.toString() + AbstractC23280z4.m120290B(uri, null, null));
        File file = new File(AbstractC20130d.m104825D(), m122788d + ".jpg");
        File file2 = new File(AbstractC20130d.m104825D(), m122788d + ".gif");
        boolean z12 = true;
        if (file.exists() && file.length() > 0) {
            str = file.getAbsolutePath();
            z11 = true;
        } else {
            if (file2.exists() && file2.length() > 0) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (z11 && !m85028ML(str)) {
                m85105FL(str, uri);
                return;
            }
            this.f78286j1 = str;
            if (!this.f78259I0) {
                if (m85026LL()) {
                    this.f78278b1.put(uri, Boolean.TRUE);
                    this.f78280d1.add(str);
                }
                m85098vM();
                return;
            }
            return;
        }
        AbstractC23041d2.m118208g(str);
        AbstractC23041d2.m118207f(file2);
        try {
            try {
                try {
                    if (!AbstractC23238v2.m119727l()) {
                        if (this.f88762c0.m92672lJ()) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.sd_card_not_available));
                        }
                        finish();
                        return;
                    }
                    InputStream openInputStream = this.f88762c0.m92648SI().getContentResolver().openInputStream(uri);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[1024];
                    boolean z13 = false;
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        if (z12) {
                            z13 = AbstractC23258x2.m119947f(bArr);
                            z12 = false;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.close();
                    String absolutePath = file.getAbsolutePath();
                    if (z13) {
                        File file3 = new File(AbstractC20130d.m104825D(), m122788d + ".gif");
                        if (AbstractC23238v2.m119718c(file, file3)) {
                            absolutePath = file3.getAbsolutePath();
                        }
                    }
                    if (!z13 && !m85028ML(absolutePath)) {
                        m85105FL(absolutePath, uri);
                    } else {
                        this.f78286j1 = absolutePath;
                        if (!this.f78259I0) {
                            if (m85026LL()) {
                                this.f78278b1.put(uri, Boolean.TRUE);
                                this.f78280d1.add(absolutePath);
                            }
                            m85098vM();
                        }
                    }
                    openInputStream.close();
                } catch (Exception e11) {
                    if (!AbstractC23227u1.m119701a(e11) && (!(e11 instanceof IOException) || AbstractC23238v2.m119726k())) {
                        ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
                        AbstractC23350e.m122776f(f78250n1, e11);
                        finish();
                        if (0 == 0) {
                            inputStream.close();
                            return;
                        }
                        return;
                    }
                    ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                    AbstractC23350e.m122776f(f78250n1, e11);
                    finish();
                    if (0 == 0) {
                    }
                }
            } catch (IOException e12) {
                AbstractC23350e.m122776f(f78250n1, e12);
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    AbstractC23350e.m122776f(f78250n1, e13);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public /* synthetic */ void m85034PL(String str) {
        m85072iM(new C20556f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QL */
    public /* synthetic */ void m85036QL() {
        this.f78287k1.m125616l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public /* synthetic */ void m85038RL(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public /* synthetic */ void m85040SL(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public /* synthetic */ void m85042TL(InterfaceC17463d interfaceC17463d, int i11) {
        m85064eM();
        if (!this.f78274X0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UL */
    public /* synthetic */ void m85044UL(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VL */
    public /* synthetic */ void m85046VL(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public /* synthetic */ void m85048WL(InterfaceC17463d interfaceC17463d, int i11) {
        m85062dM();
        if (!this.f78274X0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XL */
    public /* synthetic */ void m85050XL(String str, Uri uri) {
        try {
            if (new C20556f(str).m106830b()) {
                if (!str.toLowerCase().endsWith(".gif") && !m85028ML(str)) {
                    m85105FL(str, uri);
                } else if (m85026LL()) {
                    this.f78278b1.put(uri, Boolean.TRUE);
                    this.f78280d1.add(str);
                } else {
                    this.f78286j1 = str;
                }
                m85098vM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public /* synthetic */ void m85052YL(ContactProfile contactProfile) {
        try {
            if (!this.f88762c0.m92677nJ()) {
                FeedActionZUtils.m47534V(this.f88762c0.m92648SI(), this.f78265O0, 1, 0);
                ToastUtils.m89272t(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_share_vip_success));
                m85084oM(contactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public /* synthetic */ void m85054ZL(C26404f c26404f, final ContactProfile contactProfile) {
        try {
            c26404f.f125444Z = this.f78277a1;
            m85102xM(c26404f);
            AbstractC23112j7.m118513W(contactProfile.mo2478b(), c26404f);
            m85088qM();
            this.f88762c0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yq0
                @Override // java.lang.Runnable
                public final void run() {
                    TempShareViaView.this.m85052YL(contactProfile);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public /* synthetic */ void m85056aM(Bundle bundle) {
        this.f88762c0.m92662fJ().m93069k2(ShareView.class, bundle, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public /* synthetic */ void m85058bM() {
        if (!this.f88762c0.m92677nJ()) {
            FeedActionZUtils.m47534V(this.f88762c0.m92648SI(), this.f78265O0, 1, 0);
            ToastUtils.m89272t(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_share_vip_success));
            m85084oM(this.f78267Q0);
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cM */
    public /* synthetic */ void m85060cM(Bundle bundle) {
        this.f88762c0.m92662fJ().m93069k2(ShareView.class, bundle, 0, true);
    }

    /* renamed from: dM */
    private void m85062dM() {
        try {
            if (!AbstractC23057e7.m118300g(this.f88762c0.m92648SI()) && C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f78267Q0.f42434r)) {
                        C20024r.m103949w();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                    }
                } else if (AbstractC23034c6.m118167n(this.f88762c0.m92648SI(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                    AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 146);
                    this.f78274X0 = true;
                } else {
                    C2279a m120722w0 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile = this.f78267Q0;
                    m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f78267Q0.f42446v, false, 13));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eM */
    private void m85064eM() {
        try {
            if (C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f78267Q0.f42434r)) {
                        C20024r.m103949w();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                    }
                } else {
                    Context m92648SI = this.f88762c0.m92648SI();
                    String[] strArr = AbstractC23034c6.f112033j;
                    if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                        AbstractC23034c6.m118184v0(this, strArr, 145);
                        this.f78274X0 = true;
                    } else {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f78267Q0;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f78267Q0.f42446v, true, 14));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public void m85066fM() {
        boolean z11;
        this.f78257G0 = false;
        Map m138630g = this.f78293z0.m138630g();
        if (m138630g == null) {
            ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
            finish();
            return;
        }
        try {
            z11 = m138630g.containsKey("has_frame");
            try {
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH)) {
                    String str = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                    Objects.requireNonNull(str);
                    this.f78251A0.m140252f0(Integer.parseInt(str));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT)) {
                    String str2 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                    Objects.requireNonNull(str2);
                    this.f78251A0.m140241Z(Integer.parseInt(str2));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION)) {
                    String str3 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                    Objects.requireNonNull(str3);
                    this.f78251A0.m140234S(Integer.parseInt(str3));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                    String str4 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                    Objects.requireNonNull(str4);
                    this.f78251A0.m140226K(Long.parseLong(str4));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC)) {
                    String str5 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC);
                    Objects.requireNonNull(str5);
                    this.f78251A0.m140239X(str5);
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE)) {
                    String str6 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                    Objects.requireNonNull(str6);
                    this.f78251A0.m140238W(Integer.parseInt(str6));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE)) {
                    String str7 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE);
                    Objects.requireNonNull(str7);
                    this.f78251A0.m140248d0(Integer.parseInt(str7));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL)) {
                    String str8 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL);
                    Objects.requireNonNull(str8);
                    this.f78251A0.m140243a0(Integer.parseInt(str8));
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC)) {
                    String str9 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC);
                    Objects.requireNonNull(str9);
                    this.f78251A0.m140223H(str9);
                }
                if (m138630g.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE)) {
                    String str10 = (String) m138630g.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                    Objects.requireNonNull(str10);
                    this.f78251A0.m140222G(Integer.parseInt(str10));
                }
            } catch (Exception e11) {
                e = e11;
                AbstractC23350e.m122776f(f78250n1, e);
                if (!z11) {
                }
                ToastUtils.m89266n(AbstractC8020f0.video_preview_error_not_has_info, new Object[0]);
                AbstractC20887g.m109237o(26028);
                finish();
            }
        } catch (Exception e12) {
            e = e12;
            z11 = false;
        }
        if (!z11 && this.f78251A0.m140254h() > 0 && this.f78251A0.m140269w() > 0) {
            boolean m118393h = AbstractC23078g6.Companion.m118393h();
            if (this.f78266P0 && this.f78267Q0 != null) {
                C26404f c26404f = new C26404f(5);
                this.f78268R0 = c26404f;
                c26404f.m136173z(this.f78251A0);
                C26404f c26404f2 = this.f78268R0;
                c26404f2.f125462r = m118393h;
                m85099wL(c26404f2, this.f78267Q0);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putAll(this.f88762c0.m92642L3());
            bundle.putBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", this.f78277a1);
            bundle.putSerializable("EXTRA_VIDEO_INFO", this.f78251A0);
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            bundle.putInt("extra_source_log", 17);
            bundle.putBoolean("bol_extra_photo_hd", m118393h);
            this.f88762c0.m92662fJ().m93069k2(ShareView.class, bundle, 0, true);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.video_preview_error_not_has_info, new Object[0]);
        AbstractC20887g.m109237o(26028);
        finish();
    }

    /* renamed from: gM */
    private void m85068gM(C27373c c27373c) {
        String str;
        try {
            CameraInputParams m39208t = CameraInputParams.m39208t(c27373c);
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            if (videoBlendingParam != null && videoBlendingParam.f48265Q > 0) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_prefix) + " ";
            } else {
                str = "";
            }
            m39208t.f41122o0 = str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_no_video_successed_one_video_failed);
            m39208t.f41124p0 = C2526d.m12658f(c27373c);
            m39208t.f41126q0 = true;
            m39208t.f41128r0 = "share_outapp";
            AbstractC22470k.m116167s(m92676n2(), 1000, 1, m39208t);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: hM */
    private boolean m85070hM() {
        if (m85026LL()) {
            Iterator it = this.f78278b1.values().iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: iM */
    private void m85072iM(C20556f c20556f) {
        this.f78258H0 = false;
        try {
            if (AbstractC23280z4.m120340m0(AbstractC3460h.m17442j(c20556f.m106842o()))) {
                finish();
                return;
            }
            C27373c c27373c = new C27373c();
            c27373c.m140250e0(c20556f.m106842o());
            c27373c.f128942O = false;
            c27373c.f128943P = false;
            c27373c.f128944Q = false;
            AbstractC26897a.m138621g(c27373c, false);
            this.f78251A0 = c27373c;
            m85080mM();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78250n1, e11);
            ToastUtils.m89266n(AbstractC8020f0.video_receiver_proxy_general_error, new Object[0]);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0006 A[SYNTHETIC] */
    /* renamed from: jM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m85074jM() {
        File file;
        Iterator it = this.f78279c1.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                String m119855c = AbstractC23254w8.m119855c(this.f88762c0.m92648SI(), uri);
                if (!TextUtils.isEmpty(m119855c)) {
                    Uri parse = Uri.parse(m119855c);
                    if (parse.getScheme() != null && !"file".equals(parse.getScheme())) {
                        file = null;
                        if (file == null && file.exists()) {
                            if (this.f78270T0 > 0 && file.length() > this.f78270T0) {
                                this.f78276Z0 = true;
                            } else {
                                if (this.f78281e1 == null) {
                                    this.f78281e1 = new ArrayList();
                                }
                                this.f78281e1.add(m119855c);
                            }
                        } else if ("content".equals(uri.getScheme())) {
                            if (this.f78282f1 == null) {
                                this.f78282f1 = new ArrayList();
                            }
                            this.f78282f1.add(uri);
                        }
                    }
                    file = new File(m119855c);
                    if (file == null) {
                    }
                    if ("content".equals(uri.getScheme())) {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: kM */
    private void m85076kM(Uri uri, boolean z11) {
        File file;
        try {
            String m119855c = AbstractC23254w8.m119855c(this.f88762c0.m92648SI(), uri);
            this.f78288l1 = m119855c;
            if (TextUtils.isEmpty(m119855c)) {
                ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
                finish();
                return;
            }
            Uri parse = Uri.parse(this.f78288l1);
            if (parse.getScheme() != null && !"file".equals(parse.getScheme())) {
                file = null;
                if (file == null && file.exists()) {
                    if (z11 && this.f78270T0 > 0 && file.length() > this.f78270T0) {
                        ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit), AbstractC23041d2.m118213l(this.f78270T0)));
                        finish();
                        return;
                    } else {
                        m85096uM();
                        return;
                    }
                }
                if (uri.getScheme() == null && uri.getScheme().equals("content")) {
                    this.f78257G0 = true;
                    m85103yL(uri, z11);
                    return;
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
                    finish();
                }
            }
            file = new File(this.f78288l1);
            if (file == null) {
            }
            if (uri.getScheme() == null) {
            }
            ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    private void m85078lM(final Uri uri) {
        try {
            this.f78257G0 = true;
            if (!TextUtils.isEmpty(uri.toString())) {
                final String m119855c = AbstractC23254w8.m119855c(this.f88762c0.m92648SI(), uri);
                if (TextUtils.isEmpty(m119855c)) {
                    m119855c = uri.toString();
                }
                if (!TextUtils.isEmpty(m119855c)) {
                    if (m119855c.startsWith("http")) {
                        m85014BL(uri);
                        return;
                    }
                    if (m119855c.startsWith("content://")) {
                        m85013AL(uri);
                        return;
                    }
                    if (!AbstractC23238v2.m119727l()) {
                        if (this.f88762c0.m92672lJ()) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.sd_card_not_available));
                        }
                        finish();
                    } else {
                        TextView textView = this.f78290w0;
                        if (textView != null) {
                            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
                        }
                        this.f78284h1.execute(new Runnable() { // from class: com.zing.zalo.ui.zviews.fr0
                            @Override // java.lang.Runnable
                            public final void run() {
                                TempShareViaView.this.m85050XL(m119855c, uri);
                            }
                        });
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    private void m85080mM() {
        if (TextUtils.isEmpty(this.f78251A0.m140220E())) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("media_uri", this.f78251A0.m140220E());
        if (TextUtils.isEmpty(this.f78251A0.m140268v())) {
            C27373c c27373c = this.f78251A0;
            String m104838J0 = AbstractC20130d.m104838J0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC23352g.m122788d(this.f78251A0.m140220E() + System.currentTimeMillis()));
            sb2.append(".jpg");
            c27373c.m140237V(new File(m104838J0, sb2.toString()).getAbsolutePath());
        }
        bundle.putString("save_path", this.f78251A0.m140268v());
        if (this.f78293z0 == null) {
            this.f78293z0 = new C26898b(this.f88762c0.m92648SI(), bundle);
        }
        if (!this.f78293z0.m138631h()) {
            this.f78293z0.m138632i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public void m85082nM(final C26404f c26404f, final ContactProfile contactProfile) {
        if (c26404f != null) {
            try {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.uq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TempShareViaView.this.m85054ZL(c26404f, contactProfile);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: oM */
    private void m85084oM(ContactProfile contactProfile) {
        Bundle m140776b = new C27870vb(contactProfile.f42434r).m140778d(contactProfile.f42437s).m140775a(contactProfile.f42446v).m140776b();
        m140776b.putInt("extra_chat_profile_type_contact", contactProfile.m40430t0());
        m140776b.putLong("extra_chat_profile_last_action", contactProfile.f42336F);
        m85086pM(ChatView.class, m140776b);
    }

    /* renamed from: pM */
    private void m85086pM(Class cls, Bundle bundle) {
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        this.f88762c0.m92676n2().mo35573l4(cls, bundle, 0, true);
    }

    /* renamed from: qM */
    private void m85088qM() {
        try {
            Thread.sleep(10L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    private void m85090rM() {
        ArrayList arrayList;
        Uri uri = this.f78252B0;
        if ((uri == null || uri.toString().length() <= 0) && !m85026LL() && ((arrayList = this.f78279c1) == null || arrayList.size() <= 0)) {
            if (!TextUtils.isEmpty(this.f78254D0)) {
                m85100wM();
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                finish();
                return;
            }
        }
        C0774b c0774b = C0774b.f2680a;
        if (c0774b.m1921g(this.f78256F0)) {
            m85017EL(this.f78252B0);
            return;
        }
        if (!TextUtils.isEmpty(this.f78256F0) && c0774b.m1919e(this.f78256F0, this.f78252B0)) {
            if (m85026LL()) {
                this.f78280d1.clear();
                ExecutorService executorService = this.f78284h1;
                if (executorService != null && !executorService.isShutdown()) {
                    this.f78284h1.shutdownNow();
                }
                this.f78284h1 = new ThreadPoolExecutor(0, Math.min(4, this.f78278b1.size() / 2), 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("TempShareVia-B"));
                Iterator it = this.f78278b1.keySet().iterator();
                while (it.hasNext()) {
                    m85078lM((Uri) it.next());
                }
                return;
            }
            m85078lM(this.f78252B0);
            return;
        }
        if (this.f78279c1.size() > 1) {
            m85074jM();
            ArrayList arrayList2 = this.f78282f1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                this.f78257G0 = true;
                m85104zL(this.f78282f1);
                return;
            } else {
                m85096uM();
                return;
            }
        }
        m85076kM(this.f78252B0, true);
    }

    /* renamed from: sM */
    private void m85092sM() {
        m85086pM(StartUpNewView.class, new Bundle());
    }

    /* renamed from: tM */
    private void m85094tM() {
        try {
            AbstractC20130d.m104905y();
            m85022JL();
            String m121675Zd = AbstractC23309i.m121675Zd();
            if (!TextUtils.isEmpty(CoreUtility.f89233i) && !TextUtils.isEmpty(CoreUtility.f89232h) && !TextUtils.isEmpty(m121675Zd)) {
                m85090rM();
                C29628e.m147249E0().m147287p1(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
                C29630g.m147299E0().m147316S0(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
                if (AbstractC26684e.f126408a) {
                    C29632i.m147326E0().m147343S0(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
                }
            }
            m85092sM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public void m85096uM() {
        this.f78257G0 = false;
        if (this.f78266P0 && this.f78267Q0 != null) {
            ArrayList arrayList = this.f78281e1;
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f78281e1.size() > 1) {
                    C26404f c26404f = new C26404f(17);
                    this.f78268R0 = c26404f;
                    c26404f.m136164q(this.f78281e1);
                } else {
                    this.f78288l1 = (String) this.f78281e1.get(0);
                    C26404f c26404f2 = new C26404f(10);
                    this.f78268R0 = c26404f2;
                    c26404f2.m136162o(this.f78288l1);
                }
            } else if (!TextUtils.isEmpty(this.f78288l1)) {
                C26404f c26404f3 = new C26404f(10);
                this.f78268R0 = c26404f3;
                c26404f3.m136162o(this.f78288l1);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_toast_all_file_size_limit, new Object[0]);
                finish();
                return;
            }
            this.f78268R0.f125462r = false;
            if (!TextUtils.isEmpty(this.f78253C0)) {
                this.f78268R0.m136172y(this.f78253C0);
            }
            C26404f c26404f4 = this.f78268R0;
            c26404f4.f125429K = 5;
            c26404f4.f125439U = this.f78283g1;
            this.f78283g1 = 0L;
            m85082nM(c26404f4, this.f78267Q0);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putBoolean("bol_share_in_app", this.f78260J0);
        bundle.putBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", this.f78277a1);
        bundle.putBoolean("btn_extra_show_hide_post_feed", this.f78262L0);
        bundle.putInt("extra_source_log", 5);
        if (AbstractC23165o5.m119333b()) {
            bundle.putBoolean("specialToShowPassCodeScreen", true);
        }
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        ArrayList arrayList2 = this.f78281e1;
        if (arrayList2 != null && arrayList2.size() > 0) {
            if (this.f78281e1.size() > 1) {
                bundle.putStringArrayList("extra_multi_data_path", this.f78281e1);
            } else {
                String str = (String) this.f78281e1.get(0);
                this.f78288l1 = str;
                bundle.putSerializable("extra_data_path", str);
            }
        } else if (!TextUtils.isEmpty(this.f78288l1)) {
            bundle.putSerializable("extra_data_path", this.f78288l1);
        } else {
            ToastUtils.m89266n(AbstractC8020f0.str_toast_all_file_size_limit, new Object[0]);
            finish();
            return;
        }
        bundle.putBoolean("extra_show_dialog_file_limit", this.f78276Z0);
        this.f88762c0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.gr0
            @Override // java.lang.Runnable
            public final void run() {
                TempShareViaView.this.m85056aM(bundle);
            }
        });
    }

    /* renamed from: vL */
    private void m85097vL(String str, Uri uri, boolean z11) {
        if (uri != null) {
            boolean equals = "*/*".equals(str);
            C0774b c0774b = C0774b.f2680a;
            if (!c0774b.m1921g(str) && (!equals || !c0774b.m1922h(uri))) {
                if (!c0774b.m1919e(str, uri) && (!equals || !c0774b.m1920f(uri))) {
                    this.f78252B0 = uri;
                    this.f78256F0 = str;
                } else {
                    if (z11) {
                        if (this.f78278b1 == null) {
                            this.f78278b1 = new HashMap();
                        }
                        this.f78278b1.put(uri, Boolean.FALSE);
                    } else {
                        this.f78252B0 = uri;
                    }
                    this.f78256F0 = "image/*";
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("share video:");
                sb2.append(uri);
                this.f78252B0 = uri;
                this.f78256F0 = str;
            }
            if (this.f78279c1 == null) {
                this.f78279c1 = new ArrayList();
            }
            if (!this.f78279c1.contains(uri)) {
                this.f78279c1.add(uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public void m85098vM() {
        boolean z11;
        try {
            if (!m85070hM()) {
                return;
            }
            this.f78257G0 = false;
            boolean m118393h = AbstractC23078g6.Companion.m118393h();
            if (this.f78266P0 && this.f78267Q0 != null) {
                if (m85026LL() && this.f78280d1.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.f78280d1) {
                        MediaItem mediaItem = new MediaItem();
                        mediaItem.m41116O0(m118393h);
                        mediaItem.mo41082W0(str);
                        arrayList.add(mediaItem);
                    }
                    C26404f c26404f = new C26404f(arrayList);
                    this.f78268R0 = c26404f;
                    c26404f.f125462r = m118393h;
                    if (!TextUtils.isEmpty(this.f78253C0)) {
                        this.f78268R0.m136172y(this.f78253C0);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(this.f78267Q0.f42434r);
                    AbstractC23112j7.m118542m0(arrayList2, this.f78268R0.m136153f(), this.f78268R0.m136160m(), 16, 17, "chat_send", EnumC24194e.f116776q);
                    if (this.f88762c0.m92676n2() != null) {
                        this.f88762c0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.vq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                TempShareViaView.this.m85058bM();
                            }
                        });
                        return;
                    }
                    return;
                }
                if (this.f78286j1.toLowerCase().endsWith(".gif")) {
                    C26404f c26404f2 = new C26404f(5);
                    this.f78268R0 = c26404f2;
                    c26404f2.f125462r = false;
                    C27373c c27373c = new C27373c();
                    c27373c.m140250e0(this.f78286j1);
                    c27373c.f128949V = true;
                    this.f78268R0.m136173z(c27373c);
                    AbstractC26897a.m138619e(c27373c);
                    String m140995l = AbstractC27985d.m140995l(System.currentTimeMillis());
                    AbstractC3460h.m17441i(this.f78286j1, new File(m140995l), 480, false);
                    c27373c.m140237V(m140995l);
                    this.f78268R0.f125451g = new C17961f1("", 0, "", "", "", "", C17961f1.m95438A(c27373c, false, 0L, 0, 0, -1L, -1), c27373c);
                    C17979l1 c17979l1 = new C17979l1();
                    c17979l1.f91060c = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
                    this.f78268R0.m136167t(c17979l1);
                } else {
                    C26404f c26404f3 = new C26404f(1);
                    this.f78268R0 = c26404f3;
                    c26404f3.f125462r = m118393h;
                }
                this.f78268R0.m136162o(this.f78286j1);
                if (!TextUtils.isEmpty(this.f78253C0)) {
                    this.f78268R0.m136172y(this.f78253C0);
                }
                m85082nM(this.f78268R0, this.f78267Q0);
                return;
            }
            final Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.f78253C0)) {
                bundle.putString("imageCaption", this.f78253C0);
            }
            bundle.putString("imagePathUri", this.f78286j1);
            if (m85026LL() && !this.f78280d1.isEmpty()) {
                bundle.putBoolean("flag_share_multi_photo", true);
                bundle.putStringArrayList("extra_share_multi_photo", new ArrayList<>(this.f78280d1));
            } else {
                bundle.putBoolean("bol_open_post_feed", this.f78261K0);
                if (!this.f78261K0 && (z11 = this.f78262L0)) {
                    bundle.putBoolean("btn_extra_show_hide_post_feed", z11);
                }
            }
            bundle.putBoolean("bol_share_in_app", this.f78260J0);
            bundle.putBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", this.f78277a1);
            bundle.putBoolean("bol_back_to_source", this.f78263M0);
            bundle.putBoolean("bol_auto_back_to_source", this.f78264N0);
            bundle.putString("token", this.f78265O0);
            if (AbstractC23165o5.m119333b()) {
                bundle.putBoolean("specialToShowPassCodeScreen", true);
            }
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            bundle.putInt("extra_source_log", 16);
            bundle.putBoolean("extra_photo_sticker", this.f78275Y0);
            bundle.putBoolean("bol_extra_photo_hd", m118393h);
            this.f88762c0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.wq0
                @Override // java.lang.Runnable
                public final void run() {
                    TempShareViaView.this.m85060cM(bundle);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wL */
    private void m85099wL(C26404f c26404f, ContactProfile contactProfile) {
        try {
            boolean z11 = c26404f.f125462r;
            if (c26404f.m136161n() != null && AbstractC23280z4.m120338l0(c26404f.m136161n(), z11 ? 1 : 0)) {
                m85082nM(c26404f, contactProfile);
            } else {
                m85068gM(c26404f.m136161n());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    private void m85100wM() {
        boolean z11;
        String str;
        if (this.f78266P0 && this.f78267Q0 != null) {
            if (!TextUtils.isEmpty(this.f78255E0)) {
                str = this.f78255E0 + " - " + this.f78254D0;
            } else {
                str = this.f78254D0;
            }
            C26404f c26404f = new C26404f(2);
            this.f78268R0 = c26404f;
            c26404f.m136168u(str);
            this.f78268R0.m136162o(this.f78254D0);
            String m153548n = C31944h6.m153548n(this.f78254D0);
            if (!TextUtils.isEmpty(m153548n)) {
                this.f78268R0.f125453i = true;
                m85101xL(m153548n);
                return;
            } else {
                C26404f c26404f2 = this.f78268R0;
                c26404f2.f125453i = false;
                m85082nM(c26404f2, this.f78267Q0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("linktoShare", this.f78254D0);
        bundle.putString("subjectForLink", this.f78255E0);
        bundle.putBoolean("bol_share_in_app", this.f78260J0);
        bundle.putBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", this.f78277a1);
        bundle.putBoolean("bol_open_post_feed", this.f78261K0);
        if (!this.f78261K0 && (z11 = this.f78262L0)) {
            bundle.putBoolean("btn_extra_show_hide_post_feed", z11);
        }
        bundle.putBoolean("bol_back_to_source", this.f78263M0);
        bundle.putBoolean("bol_auto_back_to_source", this.f78264N0);
        bundle.putString("token", this.f78265O0);
        if (AbstractC23165o5.m119333b()) {
            bundle.putBoolean("specialToShowPassCodeScreen", true);
        }
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        this.f88762c0.m92662fJ().m93069k2(ShareView.class, bundle, 0, true);
    }

    /* renamed from: xL */
    private void m85101xL(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C32204z7.m155260j().m155277x(str, false, false, 1, new C15164b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    private void m85102xM(C26404f c26404f) {
        String m153548n = C31944h6.m153548n(c26404f.m136155h());
        if (m153548n.isEmpty()) {
            return;
        }
        if (c26404f.m136154g() == null) {
            c26404f.m136167t(new C17979l1());
        }
        if (c26404f.m136157j() != null) {
            c26404f.m136154g().f91072o = new C32063p6(EnumC27375b.f128976u, true, !c26404f.m136157j().f125480c.isEmpty(), C31944h6.m153554u(c26404f.m136157j().f125481d), 0L, false);
        } else {
            c26404f.m136154g().f91072o = new C32063p6(EnumC27375b.f128976u, false, false, C31944h6.m153554u(m153548n), 0L, false);
        }
    }

    /* renamed from: yL */
    private void m85103yL(final Uri uri, final boolean z11) {
        try {
            TextView textView = this.f78290w0;
            if (textView != null) {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.loading_file_from_server));
            }
            this.f78284h1.execute(new Runnable() { // from class: com.zing.zalo.ui.zviews.er0
                @Override // java.lang.Runnable
                public final void run() {
                    TempShareViaView.this.m85030NL(uri, z11);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78250n1, e11);
        }
    }

    /* renamed from: zL */
    private void m85104zL(List list) {
        try {
            TextView textView = this.f78290w0;
            if (textView != null) {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.loading_file_from_server));
            }
            this.f78289m1 = list.size();
            this.f78283g1 = C23793c.m124316k().mo124319c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f78284h1.execute(new RunnableC15165c((Uri) it.next()));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78250n1, e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(false);
        AbstractC23304d.m120531b();
    }

    /* renamed from: FL */
    public void m85105FL(String str, Uri uri) {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_image_to_share));
        AbstractC20887g.m109240r(26027, String.valueOf(AbstractC23041d2.m118224w(str)));
        AbstractC23041d2.m118208g(str);
        if (!m85026LL()) {
            finish();
            return;
        }
        if (!this.f78259I0) {
            this.f78278b1.put(uri, Boolean.TRUE);
            if (m85070hM()) {
                if (!this.f78280d1.isEmpty()) {
                    m85098vM();
                } else {
                    finish();
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String m118743r0;
        View inflate = layoutInflater.inflate(AbstractC7409c0.temp_share_via_view, viewGroup, false);
        try {
            m85024KL(inflate);
            this.f78276Z0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            finish();
        }
        if (!m85018GL(this.f88762c0.m92642L3())) {
            if (this.f78269S0) {
                ToastUtils.m89273u();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
            finish();
            return inflate;
        }
        if (this.f78271U0) {
            try {
                this.f78273W0 = "";
                m85019HL();
                if (!this.f78274X0) {
                    finish();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (!TextUtils.isEmpty(this.f78273W0)) {
                    m118743r0 = this.f78273W0;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
                }
                ToastUtils.showMess(m118743r0);
                finish();
            }
            return layoutInflater.inflate(AbstractC7409c0.transparent_view, viewGroup, false);
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            m85094tM();
        } else if (!this.f78257G0) {
            m85090rM();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f78292y0 = new C15166d(this.f88762c0.m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        if (this.f78292y0 != null) {
            this.f88762c0.m92648SI().unregisterReceiver(this.f78292y0);
            this.f78292y0 = null;
        }
        super.mo37712VJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78250n1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000) {
            if (i12 == -1 && intent != null) {
                m85020IL(i12, intent);
            } else {
                this.f78293z0 = null;
                finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_cancel) {
            this.f78259I0 = true;
            ExecutorService executorService = this.f78284h1;
            if (executorService != null && !executorService.isShutdown()) {
                this.f78284h1.shutdownNow();
            }
            if (this.f78287k1 != null) {
                AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.tq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TempShareViaView.this.m85036QL();
                    }
                });
            }
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        String m118743r0;
        if (i11 == 146) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118165m(this.f88762c0.m92648SI(), "android.permission.RECORD_AUDIO") == 0) {
                if (this.f78267Q0 != null) {
                    C2279a m120722w0 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile = this.f78267Q0;
                    m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f78267Q0.f42446v, false, 13));
                }
                finish();
            } else {
                AbstractC23034c6.m118164l0(this.f88762c0.m92676n2(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sq0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        TempShareViaView.this.m85046VL(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zq0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        TempShareViaView.this.m85048WL(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.ar0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        TempShareViaView.this.m85038RL(interfaceC17463d);
                    }
                });
            }
        } else if (i11 == 145) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f88762c0.m92648SI(), AbstractC23034c6.f112033j) == 0) {
                if (this.f78267Q0 != null) {
                    C2279a m120722w02 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile2 = this.f78267Q0;
                    m120722w02.m101508a(new C2279a.a(contactProfile2.f42434r, contactProfile2.m40383Q(true, false), this.f78267Q0.f42446v, true, 14));
                }
                finish();
            } else {
                AbstractC23034c6.m118170o0(this.f88762c0.m92676n2(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.br0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        TempShareViaView.this.m85040SL(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cr0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        TempShareViaView.this.m85042TL(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.dr0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        TempShareViaView.this.m85044UL(interfaceC17463d);
                    }
                });
            }
        } else if (i11 == 108) {
            if (AbstractC23034c6.m118167n(this.f88762c0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                try {
                    this.f78273W0 = "";
                    m85019HL();
                    if (!this.f78274X0) {
                        finish();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (!TextUtils.isEmpty(this.f78273W0)) {
                        m118743r0 = this.f78273W0;
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
                    }
                    ToastUtils.showMess(m118743r0);
                    finish();
                }
            } else {
                finish();
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C26898b c26898b = this.f78293z0;
        if (c26898b != null && c26898b.m138631h()) {
            m85066fM();
        }
    }
}
