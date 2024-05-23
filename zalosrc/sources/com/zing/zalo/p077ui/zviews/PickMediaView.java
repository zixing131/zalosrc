package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.AbstractC0857z0;
import ag0.C0815e1;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.zviews.PickMediaView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import i90.AbstractC20435a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm0.C21295e;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21304n;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23204s0;
import me0.AbstractC23211s7;
import me0.AbstractC23254w8;
import me0.AbstractC23277z1;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p239ih.C20556f;
import p322lf.AbstractC22470k;
import p483rh.InterfaceC25792a;
import p559uv.C27373c;
import p609wh.C29037t0;
import p620wt.AbstractC29237l;
import su.C26388b;
import th.AbstractC26689j;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public class PickMediaView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    private PickMediaDialogView f75922P0;

    /* renamed from: Q0 */
    ProgressDialogView f75923Q0;

    /* renamed from: R0 */
    private InterfaceC25792a.c f75924R0;

    /* renamed from: M0 */
    private final String f75919M0 = AbstractC23204s0.m119555f();

    /* renamed from: N0 */
    private final String f75920N0 = AbstractC20130d.m104894s0();

    /* renamed from: O0 */
    private final String f75921O0 = AbstractC20130d.m104892r0();

    /* renamed from: S0 */
    public int f75925S0 = 6;

    /* renamed from: T0 */
    public int f75926T0 = 1;

    /* renamed from: U0 */
    public int f75927U0 = 0;

    /* renamed from: V0 */
    private C14734d f75928V0 = null;

    /* renamed from: W0 */
    private C14733c f75929W0 = new C14733c();

    /* renamed from: X0 */
    private boolean f75930X0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$a */
    /* loaded from: classes6.dex */
    public class C14731a implements InterfaceC7761b.c {
        C14731a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m82634g() {
            PickMediaView.this.f75923Q0.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m82635h() {
            ProgressDialogView progressDialogView = PickMediaView.this.f75923Q0;
            if (progressDialogView != null) {
                progressDialogView.dismiss();
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(-102, "Compress time out", "action.pick.media"), "");
            if (interfaceC7761b != null) {
                C0815e1.m2075D().m2111i(interfaceC7761b);
            }
            PickMediaView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w40
                @Override // java.lang.Runnable
                public final void run() {
                    PickMediaView.C14731a.this.m82634g();
                }
            });
            PickMediaView.this.finish();
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            PickMediaView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x40
                @Override // java.lang.Runnable
                public final void run() {
                    PickMediaView.C14731a.this.m82635h();
                }
            });
            PickMediaView.this.m82617mM(str);
            C0815e1.m2075D().m2111i(interfaceC7761b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$b */
    /* loaded from: classes6.dex */
    public class C14732b extends AbstractC0857z0 {

        /* renamed from: g */
        int f75933g = 0;

        /* renamed from: f */
        ArrayList f75932f = new ArrayList();

        public C14732b(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f75932f.add(new File((String) it.next()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m82637v(C14732b c14732b, InterfaceC17463d interfaceC17463d) {
            if (!c14732b.m2435k()) {
                c14732b.m2431f(true);
            }
            PickMediaView.this.m82631wM();
            if (PickMediaView.this.f75924R0 != null) {
                try {
                    PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, "onCancel ....", "action.pick.media"), "");
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // ag0.AbstractC0857z0
        /* renamed from: o */
        protected void mo2439o() {
            this.f75933g = 0;
            PickMediaView pickMediaView = PickMediaView.this;
            if (pickMediaView.f75926T0 == 0) {
                pickMediaView.f75922P0 = PickMediaDialogView.m82601YK();
                PickMediaView.this.f75922P0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.y40
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        PickMediaView.C14732b.this.m82637v(this, interfaceC17463d);
                    }
                });
                PickMediaView.this.f75922P0.mo83093TK(PickMediaView.this.m92662fJ());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Finally extract failed */
        @Override // ag0.AbstractC0857z0
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public ArrayList mo2432g(ArrayList... arrayListArr) {
            try {
                ArrayList arrayList = arrayListArr[0];
                if (arrayList != null && this.f75932f != null) {
                    Iterator it = arrayList.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        if (file.exists()) {
                            i11 = (int) (i11 + file.length());
                        }
                    }
                    int i12 = 0;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        File file2 = (File) arrayList.get(i13);
                        if (file2.exists()) {
                            File file3 = (File) this.f75932f.get(i13);
                            if (m2435k()) {
                                return null;
                            }
                            if (file2.getPath().equals(file3.getPath())) {
                                i12 = (int) (i12 + file2.length());
                                int i14 = (int) ((i12 * 100.0f) / i11);
                                if (this.f75933g != i14) {
                                    this.f75933g = i14;
                                    PickMediaView.this.m82627BM(i14);
                                }
                            } else {
                                if (file3.exists()) {
                                    file3.delete();
                                }
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        while (true) {
                                            int read = fileInputStream.read(bArr);
                                            if (read > 0) {
                                                if (m2435k()) {
                                                    fileOutputStream.close();
                                                    fileInputStream.close();
                                                    return null;
                                                }
                                                i12 += read;
                                                int i15 = (int) ((i12 * 100.0f) / i11);
                                                if (this.f75933g != i15) {
                                                    this.f75933g = i15;
                                                    PickMediaView.this.m82627BM(i15);
                                                }
                                                fileOutputStream.write(bArr, 0, read);
                                            } else {
                                                fileOutputStream.close();
                                                fileInputStream.close();
                                                break;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                    throw th4;
                                }
                            }
                        }
                    }
                    return this.f75932f;
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo2438n(ArrayList arrayList) {
            if (m2435k()) {
                return;
            }
            PickMediaView.this.m82631wM();
            if (PickMediaView.this.f75924R0 != null) {
                try {
                    if (arrayList != null) {
                        PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141919S0("action.pick.media", PickMediaView.this.m82629qM(arrayList)), "");
                    } else {
                        PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, "list file empty", "action.pick.media"), "");
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$c */
    /* loaded from: classes6.dex */
    public static class C14733c {

        /* renamed from: a */
        public int f75935a = 0;

        /* renamed from: b */
        public String f75936b = "";
    }

    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$d */
    /* loaded from: classes6.dex */
    public static class C14734d {

        /* renamed from: a */
        public int f75937a = 1;

        /* renamed from: b */
        public String f75938b = "";

        /* renamed from: c */
        public long f75939c = 3145728;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$e */
    /* loaded from: classes6.dex */
    public class C14735e extends C29037t0 {
        public C14735e(InterfaceC21299i interfaceC21299i) {
            super(interfaceC21299i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p609wh.C29037t0, jm0.AbstractC21298h
        /* renamed from: T */
        public void mo82640T(HttpURLConnection httpURLConnection) {
            httpURLConnection.setRequestProperty("zcid", "");
            httpURLConnection.setRequestProperty("platform", "");
            httpURLConnection.setRequestProperty("clientVersion", "");
            httpURLConnection.setRequestProperty("networktype", "");
            httpURLConnection.setRequestProperty("operator", "");
            httpURLConnection.setRequestProperty("viewerkey", "");
            super.mo82640T(httpURLConnection);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$f */
    /* loaded from: classes6.dex */
    public class C14736f extends AbstractC0857z0 {

        /* renamed from: f */
        String f75941f;

        /* renamed from: g */
        int f75942g = 0;

        /* renamed from: h */
        C29037t0 f75943h = null;

        /* renamed from: i */
        int f75944i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.PickMediaView$f$a */
        /* loaded from: classes6.dex */
        public class a implements InterfaceC21299i {
            a() {
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: c */
            public void mo1342c(C20096c c20096c) {
                if (PickMediaView.this.f75924R0 != null) {
                    PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, c20096c.m104492d(), "action.pick.media"), "");
                }
                PickMediaView.this.m82631wM();
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: f */
            public void mo1343f(JSONObject jSONObject) {
                if (PickMediaView.this.f75924R0 != null) {
                    PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141919S0("action.pick.media", PickMediaView.this.m82630rM(jSONObject.toString())), "");
                }
                PickMediaView.this.m82631wM();
            }
        }

        public C14736f(String str) {
            this.f75941f = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public /* synthetic */ void m82641B(int[] iArr, int i11, long j11) {
            if (j11 >= 100) {
                iArr[0] = iArr[0] + 1;
                return;
            }
            int i12 = (int) ((((float) ((iArr[0] * 100) + j11)) * 100.0f) / i11);
            if (this.f75942g != i12) {
                this.f75942g = i12;
                PickMediaView.this.m82627BM(i12);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public /* synthetic */ void m82642C(C14736f c14736f, InterfaceC17463d interfaceC17463d) {
            if (!c14736f.m2435k()) {
                c14736f.m2431f(true);
            }
            m82651w();
            PickMediaView.this.m82631wM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public /* synthetic */ void m82643D(final C14736f c14736f) {
            PickMediaView.this.f75922P0 = PickMediaDialogView.m82601YK();
            PickMediaView.this.f75922P0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.b50
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    PickMediaView.C14736f.this.m82642C(c14736f, interfaceC17463d);
                }
            });
            PickMediaView.this.f75922P0.mo83093TK(PickMediaView.this.m92662fJ());
        }

        /* renamed from: x */
        private ArrayList m82647x(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            int sqrt = (int) Math.sqrt(((float) PickMediaView.this.f75928V0.f75939c) / 4.0f);
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                File file = (File) it.next();
                String path = file.getPath();
                int m120058b = AbstractC23277z1.m120058b(path);
                if (file.length() > PickMediaView.this.f75928V0.f75939c) {
                    z11 = true;
                }
                if (m120058b == 0 && !z11) {
                    arrayList2.add(file);
                } else {
                    Bitmap m82619oM = PickMediaView.m82619oM(path, m120058b, z11, sqrt);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (AbstractC23041d2.m118216o(file.getPath()).equals("png")) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    String str = PickMediaView.this.f75920N0 + file.getName();
                    AbstractC23009a3.m117972w(m82619oM, compressFormat, AbstractC26689j.m137103l(), str);
                    arrayList2.add(new File(str));
                }
            }
            return arrayList2;
        }

        /* renamed from: y */
        private String m82648y(Uri uri) {
            FileOutputStream fileOutputStream;
            InputStream openInputStream;
            Cursor m135984j = C26388b.m135984j(MainApplication.getAppContext(), uri, new String[]{"_display_name"}, null, null, null, false);
            int columnIndex = m135984j.getColumnIndex("_display_name");
            m135984j.moveToFirst();
            String string = m135984j.getString(columnIndex);
            m135984j.close();
            File file = new File(PickMediaView.this.f75921O0 + "/" + string);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    openInputStream = MainApplication.getAppContext().getContentResolver().openInputStream(uri);
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                openInputStream.close();
                fileOutputStream.close();
                return file.getPath();
            } finally {
            }
        }

        /* renamed from: A */
        public void m82649A(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Uri) it.next()).toString());
            }
            m2434i(AbstractC0837p0.m2225f(), arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo2440p(Integer... numArr) {
            if (this.f75942g == numArr[0].intValue()) {
                return;
            }
            this.f75942g = numArr[0].intValue();
            if (PickMediaView.this.f75922P0 != null && PickMediaView.this.f75922P0.m92595KK()) {
                PickMediaView.this.f75922P0.m82602ZK(numArr[0].intValue());
            }
        }

        @Override // ag0.AbstractC0857z0
        /* renamed from: o */
        protected void mo2439o() {
            this.f75942g = 0;
            PickMediaView pickMediaView = PickMediaView.this;
            if (pickMediaView.f75926T0 == 0) {
                pickMediaView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.z40
                    @Override // java.lang.Runnable
                    public final void run() {
                        PickMediaView.C14736f.this.m82643D(this);
                    }
                });
            }
            PickMediaView.this.finish();
        }

        /* renamed from: w */
        void m82651w() {
            C29037t0 c29037t0 = this.f75943h;
            if (c29037t0 != null) {
                c29037t0.mo51554n();
                this.f75943h = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public Void mo2432g(ArrayList... arrayListArr) {
            ArrayList arrayList = arrayListArr[0];
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (AbstractC23254w8.m119859g(str)) {
                    arrayList2.add(new File(m82648y(AbstractC23254w8.m119853a(str))));
                } else {
                    arrayList2.add(new File(str));
                }
            }
            if (arrayList2.size() == 0) {
                PickMediaView.this.m82631wM();
                if (PickMediaView.this.f75924R0 != null) {
                    PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, "file input null or empty", "action.pick.media"), "");
                }
                return null;
            }
            int i11 = this.f75944i;
            if (i11 == 4 || i11 == 8 || i11 == 1 || i11 == 7) {
                arrayList2 = m82647x(arrayList2);
            }
            try {
                C14735e c14735e = new C14735e(new a());
                this.f75943h = c14735e;
                c14735e.f103775r = 6;
                c14735e.m110311h0(EnumC21297g.WITHOUT_AUTHENTICATION_INFO);
                this.f75943h.f103772o = this.f75941f;
                final int size = arrayList2.size() * 100;
                final int[] iArr = {0};
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    File file = (File) it2.next();
                    if (m2435k()) {
                        PickMediaView.this.m82631wM();
                        if (PickMediaView.this.f75924R0 != null) {
                            PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, "cancel upload task", "action.pick.media"), "");
                        }
                        return null;
                    }
                    C21295e c21295e = new C21295e("file", file.getName(), "application/octet-stream", file);
                    c21295e.m110264h(new InterfaceC21304n() { // from class: com.zing.zalo.ui.zviews.a50
                        @Override // jm0.InterfaceC21304n
                        /* renamed from: a */
                        public final void mo87256a(long j11) {
                            PickMediaView.C14736f.this.m82641B(iArr, size, j11);
                        }
                    });
                    this.f75943h.m110310h(c21295e);
                }
                if (C23055e5.m118271f()) {
                    C29037t0 c29037t0 = this.f75943h;
                    if (c29037t0 != null) {
                        c29037t0.mo110303Z();
                    }
                } else {
                    PickMediaView.this.m82631wM();
                    this.f75943h = null;
                    if (PickMediaView.this.f75924R0 != null) {
                        PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, "network error", "action.pick.media"), "");
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                PickMediaView.this.m82631wM();
                this.f75943h = null;
                if (PickMediaView.this.f75924R0 != null) {
                    PickMediaView.this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(999, e11.getMessage(), "action.pick.media"), "");
                }
            }
            return null;
        }

        public C14736f(String str, int i11) {
            this.f75941f = str;
            this.f75944i = i11;
        }
    }

    /* renamed from: AM */
    public static PickMediaView m82607AM(int i11, int i12, int i13, C14734d c14734d, C14733c c14733c, InterfaceC25792a.c cVar) {
        PickMediaView pickMediaView = new PickMediaView();
        pickMediaView.f75925S0 = i11;
        pickMediaView.f75927U0 = i12;
        pickMediaView.f75926T0 = i13;
        pickMediaView.f75928V0 = c14734d;
        pickMediaView.f75929W0 = c14733c;
        pickMediaView.f75924R0 = cVar;
        return pickMediaView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public void m82617mM(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m82618nM(arrayList);
    }

    /* renamed from: nM */
    private void m82618nM(List list) {
        String m106842o;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20556f c20556f = new C20556f((String) it.next());
            if (c20556f.m106844q()) {
                m106842o = c20556f.m106831c();
            } else {
                m106842o = c20556f.m106842o();
            }
            if (m106842o != null) {
                arrayList3.add(m106842o);
                arrayList2.add(new File(m106842o));
                arrayList.add(this.f75919M0 + c20556f.m106835h());
            }
        }
        C14734d c14734d = this.f75928V0;
        if (c14734d != null && c14734d.f75937a == 0) {
            new C14736f(this.f75928V0.f75938b, this.f75925S0).m2434i(AbstractC0837p0.m2225f(), arrayList3);
        } else {
            new C14732b(arrayList).m2434i(AbstractC0837p0.m2225f(), arrayList2);
        }
    }

    /* renamed from: oM */
    public static Bitmap m82619oM(String str, int i11, boolean z11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        C20556f c20556f = new C20556f(str);
        InputStream m106838k = c20556f.m106838k();
        Bitmap decodeStream = BitmapFactory.decodeStream(m106838k, null, options);
        if (z11) {
            int m117970u = AbstractC23009a3.m117970u(options.outWidth, options.outHeight, i12);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = m117970u;
            InputStream m106838k2 = c20556f.m106838k();
            try {
                try {
                    decodeStream = BitmapFactory.decodeStream(m106838k2, null, options2);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                AbstractC29237l.m145996a(m106838k);
                AbstractC29237l.m145996a(m106838k2);
            }
        }
        Bitmap bitmap = decodeStream;
        if (i11 != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i11, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (OutOfMemoryError unused) {
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: sM */
    private void m82620sM(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            if (intent.hasExtra("EXTRA_VIDEO_INFO")) {
                m82621tM(intent);
                return;
            } else {
                m82617mM(intent.getStringExtra("extra_result_output_path"));
                return;
            }
        }
        this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(-101, "User cancel", "action.pick.media"), "");
        finish();
    }

    /* renamed from: tM */
    private void m82621tM(Intent intent) {
        C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
        if (c27373c != null) {
            if (!c27373c.f128943P) {
                m82617mM(c27373c.m140220E());
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.f75926T0 == 0) {
                ProgressDialogView progressDialogView = new ProgressDialogView();
                this.f75923Q0 = progressDialogView;
                progressDialogView.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f75923Q0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.u40
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        PickMediaView.m82625yM(currentTimeMillis, interfaceC17463d);
                    }
                });
                this.f75923Q0.mo83093TK(m92662fJ());
            }
            C7760a.f41634a.mo39564b(currentTimeMillis, C20131e.f99303a.m104960j0(), c27373c.f128947T, new C14731a(), 0, null);
            finish();
        }
    }

    /* renamed from: uM */
    private void m82622uM(int i11, Intent intent) {
        boolean z11;
        C14734d c14734d = this.f75928V0;
        if (c14734d != null && c14734d.f75937a != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    if (intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(intent.getData());
                        if (z11) {
                            m82628pM(arrayList, this.f75919M0);
                            return;
                        } else {
                            if (!TextUtils.isEmpty(this.f75928V0.f75938b)) {
                                new C14736f(this.f75928V0.f75938b).m82649A(arrayList);
                                return;
                            }
                            return;
                        }
                    }
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                            ClipData.Item itemAt = clipData.getItemAt(i12);
                            if (itemAt != null && itemAt.getUri() != null) {
                                arrayList2.add(itemAt.getUri());
                            }
                        }
                        if (z11) {
                            m82628pM(arrayList2, this.f75919M0);
                            return;
                        } else {
                            new C14736f(this.f75928V0.f75938b).m82649A(arrayList2);
                            return;
                        }
                    }
                    return;
                }
                AbstractC20110a.m104535d("below Q ... file picker .... wrong flow", new Object[0]);
                return;
            }
            return;
        }
        if (i11 == 200) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_selected_file");
            if (z11) {
                try {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (stringArrayListExtra != null) {
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            File file = new File(it.next());
                            if (file.exists()) {
                                arrayList3.add(file);
                                arrayList4.add(this.f75919M0 + file.getName());
                            }
                        }
                        if (arrayList3.size() > 0) {
                            new C14732b(arrayList4).m2434i(AbstractC0837p0.m2225f(), arrayList3);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.f75928V0.f75938b)) {
                new C14736f(this.f75928V0.f75938b).m2434i(AbstractC0837p0.m2225f(), stringArrayListExtra);
                return;
            }
            return;
        }
        if (i11 == 201) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_file");
            if (parcelableArrayListExtra != null) {
                if (z11) {
                    m82628pM(parcelableArrayListExtra, this.f75919M0);
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(this.f75928V0.f75938b)) {
                        new C14736f(this.f75928V0.f75938b).m82649A(parcelableArrayListExtra);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                    return;
                }
            }
            return;
        }
        this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(-101, "User cancel", "action.pick.media"), "");
        finish();
    }

    /* renamed from: vM */
    private void m82623vM(int i11, Intent intent) {
        String str;
        try {
            if (i11 == -1 && intent != null) {
                List<MediaItem> m71440ZM = GalleryPickerView.m71440ZM(intent);
                ArrayList arrayList = new ArrayList();
                for (MediaItem mediaItem : m71440ZM) {
                    if (mediaItem != null) {
                        if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                            str = mediaItem.m41113N();
                        } else if (TextUtils.isEmpty(mediaItem.mo41081Q())) {
                            str = "";
                        } else {
                            str = mediaItem.mo41081Q();
                        }
                        arrayList.add(str);
                    }
                }
                m82618nM(arrayList);
                return;
            }
            this.f75924R0.mo39930a(AbstractC28207v1.m141899N0(-101, "User cancel", "action.pick.media"), "");
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    private boolean m82624xM() {
        if (!this.f75930X0 || m92662fJ() == null) {
            return false;
        }
        ZaloView m93012K0 = m92662fJ().m93012K0();
        ZaloView m93004H0 = m92662fJ().m93004H0();
        if (m93012K0 != this && (m93004H0 != this || m93012K0 == null || !m93012K0.m92681pJ())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static /* synthetic */ void m82625yM(long j11, InterfaceC17463d interfaceC17463d) {
        C7760a.f41634a.mo39563a(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m82626zM() {
        PickMediaDialogView pickMediaDialogView = this.f75922P0;
        if (pickMediaDialogView != null && pickMediaDialogView.m92595KK()) {
            this.f75922P0.dismiss();
            this.f75922P0 = null;
        }
        this.f72421L0.finish();
    }

    /* renamed from: BM */
    void m82627BM(int i11) {
        PickMediaDialogView pickMediaDialogView = this.f75922P0;
        if (pickMediaDialogView != null && pickMediaDialogView.m92595KK()) {
            this.f75922P0.m82602ZK(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        boolean z11 = false;
        if (bundle != null && bundle.getBoolean("PROCESSING_ACTIVITY", false)) {
            z11 = true;
        }
        this.f75930X0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("PROCESSING_ACTIVITY", this.f75930X0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            boolean z13 = true;
            this.f75930X0 = true;
            switch (this.f75925S0) {
                case 1:
                    CameraInputParams m106442a = AbstractC20435a.m106442a(-1);
                    m106442a.f41138w0 = new SensitiveData("action_pick_media", "action_common");
                    AbstractC22470k.m116167s(m92676n2(), 3, 1, m106442a);
                    return;
                case 2:
                    CameraInputParams m106443b = AbstractC20435a.m106443b(26);
                    m106443b.f41138w0 = new SensitiveData("action_pick_media", "action_common");
                    AbstractC22470k.m116167s(m92676n2(), 3, 1, m106443b);
                    return;
                case 3:
                    CameraInputParams m39195e = CameraInputParams.m39195e();
                    m39195e.f41138w0 = new SensitiveData("action_pick_media", "action_common");
                    AbstractC22470k.m116167s(m92676n2(), 3, 1, m39195e);
                    return;
                case 4:
                    Bundle bundle = new Bundle();
                    bundle.putInt("extra_photo_type", 25);
                    if (this.f75929W0.f75935a != 1) {
                        z13 = false;
                    }
                    bundle.putBoolean("extra_action_pick_media_edit_view_enable", z13);
                    bundle.putString("extra_action_pick_media_edit_view_aspect_ratio", this.f75929W0.f75936b);
                    bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_action_pick_media", "action_common"));
                    AbstractC23211s7.m119590w(m92676n2(), 2, bundle);
                    return;
                case 5:
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_action_pick_media", "action_common"));
                    AbstractC23211s7.m119589v(m92676n2(), 2, 26, true, bundle2);
                    return;
                case 6:
                    AbstractC23211s7.m119586s(m92676n2(), this);
                    return;
                case 7:
                    CameraInputParams m39196f = CameraInputParams.m39196f();
                    m39196f.f41138w0 = new SensitiveData("action_pick_media", "action_common");
                    AbstractC22470k.m116167s(m92676n2(), 3, 1, m39196f);
                    return;
                case 8:
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("extra_photo_type", 10);
                    bundle3.putInt("extra_max_selected_items", this.f75927U0);
                    bundle3.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_action_pick_media", "action_common"));
                    if (this.f75927U0 > 0) {
                        bundle3.putString("extra_message_reach_limit", String.format(m92652XI(AbstractC8020f0.str_message_pick_photo_reach_limit), Integer.valueOf(this.f75927U0)));
                    }
                    AbstractC23211s7.m119590w(m92676n2(), 2, bundle3);
                    return;
                case 9:
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_action_pick_media", "action_common"));
                    AbstractC23211s7.m119589v(m92676n2(), 2, 18, true, bundle4);
                    return;
                default:
                    finish();
                    return;
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PickMediaView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.f75930X0 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    finish();
                } else {
                    m82620sM(i12, intent);
                }
            } else {
                m82623vM(i12, intent);
            }
        } else {
            m82622uM(i12, intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (m82624xM()) {
            finish();
        }
    }

    /* renamed from: pM */
    void m82628pM(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                try {
                    Cursor m135983i = C26388b.m135983i(this.f72421L0.getContext(), uri, null, null, null, null, null, false);
                    if (m135983i != null) {
                        try {
                            if (m135983i.moveToFirst()) {
                                String string = m135983i.getString(m135983i.getColumnIndex("_display_name"));
                                String m119855c = AbstractC23254w8.m119855c(MainApplication.getAppContext(), uri);
                                String str2 = str + string;
                                if (m119855c != null) {
                                    arrayList2.add(new File(m119855c));
                                }
                                arrayList3.add(str2);
                            }
                        } catch (Throwable th2) {
                            try {
                                m135983i.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                            break;
                        }
                    }
                    if (m135983i != null) {
                        m135983i.close();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
        if (arrayList2.size() > 0) {
            new C14732b(arrayList3).m2434i(AbstractC0837p0.m2225f(), arrayList2);
        }
    }

    /* renamed from: qM */
    String m82629qM(ArrayList arrayList) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((File) it.next()).getAbsolutePath());
                }
            }
            jSONObject.put("path", jSONArray);
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: rM */
    String m82630rM(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result_content", str);
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: wM */
    void m82631wM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v40
            @Override // java.lang.Runnable
            public final void run() {
                PickMediaView.this.m82626zM();
            }
        });
    }
}
