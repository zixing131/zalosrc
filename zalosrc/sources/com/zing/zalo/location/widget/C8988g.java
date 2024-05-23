package com.zing.zalo.location.widget;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.location.widget.C8988g;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.C28203u6;

/* renamed from: com.zing.zalo.location.widget.g */
/* loaded from: classes4.dex */
public class C8988g {

    /* renamed from: a */
    final Set f48123a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    Map f48124b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.widget.g$a */
    /* loaded from: classes4.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C3977j f48125l1;

        /* renamed from: m1 */
        final /* synthetic */ c f48126m1;

        /* renamed from: n1 */
        final /* synthetic */ String f48127n1;

        a(C3977j c3977j, c cVar, String str) {
            this.f48125l1 = c3977j;
            this.f48126m1 = cVar;
            this.f48127n1 = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (C8988g.this.f48123a.contains(this.f48125l1)) {
                this.f48125l1.setImageInfo(c3979l, false);
            }
            if (c3979l != null && c3979l.m18849m()) {
                c cVar = this.f48126m1;
                if (cVar != null) {
                    cVar.mo48079a(this.f48127n1, c3979l.m18839c());
                    return;
                }
                return;
            }
            c cVar2 = this.f48126m1;
            if (cVar2 != null) {
                cVar2.mo48079a(this.f48127n1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.widget.g$b */
    /* loaded from: classes4.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C3977j f48129l1;

        /* renamed from: m1 */
        final /* synthetic */ ContactProfile f48130m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f48131n1;

        /* renamed from: o1 */
        final /* synthetic */ boolean f48132o1;

        /* renamed from: p1 */
        final /* synthetic */ c f48133p1;

        /* renamed from: q1 */
        final /* synthetic */ Context f48134q1;

        /* renamed from: r1 */
        final /* synthetic */ String f48135r1;

        b(C3977j c3977j, ContactProfile contactProfile, boolean z11, boolean z12, c cVar, Context context, String str) {
            this.f48129l1 = c3977j;
            this.f48130m1 = contactProfile;
            this.f48131n1 = z11;
            this.f48132o1 = z12;
            this.f48133p1 = cVar;
            this.f48134q1 = context;
            this.f48135r1 = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public static /* synthetic */ void m48090H3(ContactProfile contactProfile, boolean z11, boolean z12, c cVar, C3979l c3979l, Context context) {
            C8988g.m48082e(contactProfile, z11, z12, cVar, c3979l.m18839c(), context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, final C3979l c3979l, C23995f c23995f) {
            if (C8988g.this.f48123a.contains(this.f48129l1)) {
                this.f48129l1.setImageInfo(c3979l, false);
            }
            if (c3979l != null && c3979l.m18849m()) {
                InterfaceC0806b1 m2225f = AbstractC0837p0.m2225f();
                final ContactProfile contactProfile = this.f48130m1;
                final boolean z11 = this.f48131n1;
                final boolean z12 = this.f48132o1;
                final c cVar = this.f48133p1;
                final Context context = this.f48134q1;
                m2225f.mo2040a(new Runnable() { // from class: com.zing.zalo.location.widget.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8988g.b.m48090H3(ContactProfile.this, z11, z12, cVar, c3979l, context);
                    }
                });
                return;
            }
            c cVar2 = this.f48133p1;
            if (cVar2 != null) {
                cVar2.mo48079a(this.f48135r1, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.location.widget.g$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo48079a(String str, Bitmap bitmap);
    }

    /* renamed from: d */
    static Bitmap m48081d(boolean z11, boolean z12, Object obj, Context context) {
        float f11;
        int i11;
        if (z11) {
            f11 = 1.5f;
        } else {
            f11 = 1.0f;
        }
        float f12 = 44.0f * f11;
        try {
            int m118742r = AbstractC23136l9.m118742r(f12);
            int m118742r2 = AbstractC23136l9.m118742r(f12);
            Bitmap createBitmap = Bitmap.createBitmap(m118742r, m118742r2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (z12) {
                i11 = 102;
            } else {
                i11 = 255;
            }
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setAlpha(i11);
            Drawable m62202T2 = AbstractC11531v0.m62202T2();
            if (m62202T2 != null) {
                m62202T2.setBounds(0, 0, m118742r, m118742r2);
                m62202T2.draw(canvas);
            }
            int m118742r3 = AbstractC23136l9.m118742r(32.0f * f11);
            int m118742r4 = AbstractC23136l9.m118742r(6.0f * f11);
            int m118742r5 = AbstractC23136l9.m118742r(f11 * 4.0f);
            if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(0, 0, m118742r3, m118742r3);
                drawable.setAlpha(i11);
                canvas.save();
                canvas.translate(m118742r4, m118742r5);
                drawable.draw(canvas);
                canvas.restore();
            } else if (obj instanceof Bitmap) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) obj);
                bitmapDrawable.setBounds(0, 0, m118742r3, m118742r3);
                bitmapDrawable.setAlpha(i11);
                canvas.save();
                canvas.translate(m118742r4, m118742r5);
                bitmapDrawable.draw(canvas);
                canvas.restore();
            }
            return createBitmap;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: e */
    static void m48082e(ContactProfile contactProfile, boolean z11, boolean z12, c cVar, Object obj, Context context) {
        Bitmap m48081d = m48081d(z11, z12, obj, context);
        if (m48081d == null) {
            if (cVar != null) {
                cVar.mo48079a(contactProfile.f42434r, null);
                return;
            }
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m48083g(contactProfile, z11, z12));
            m48081d.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (cVar != null) {
                cVar.mo48079a(contactProfile.f42434r, m48081d);
            }
        } catch (IOException e11) {
            AbstractC23350e.m122778h(e11);
            if (cVar != null) {
                cVar.mo48079a(contactProfile.f42434r, null);
            }
        }
    }

    /* renamed from: g */
    static String m48083g(ContactProfile contactProfile, boolean z11, boolean z12) {
        String m48084h = m48084h(contactProfile, z11, z12);
        return new File(AbstractC20130d.m104905y(), m48084h + ".png").getAbsolutePath();
    }

    /* renamed from: h */
    public static String m48084h(ContactProfile contactProfile, boolean z11, boolean z12) {
        String m118087g;
        if (contactProfile == null) {
            return "";
        }
        if ((TextUtils.isEmpty(contactProfile.f42446v) || C23302b.f113247a.m120523d(contactProfile.f42446v)) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
            m118087g = AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false));
        } else {
            m118087g = contactProfile.f42446v;
        }
        return AbstractC23352g.m122788d("marker_v1_" + contactProfile.f42434r + "_" + z11 + "_" + z12 + "_" + m118087g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0008, B:5:0x001d, B:9:0x004f, B:11:0x005e, B:14:0x0081, B:16:0x0089, B:18:0x00c1, B:20:0x0093, B:22:0x009d, B:24:0x002e, B:26:0x0036, B:28:0x003e, B:29:0x0042, B:31:0x004a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0008, B:5:0x001d, B:9:0x004f, B:11:0x005e, B:14:0x0081, B:16:0x0089, B:18:0x00c1, B:20:0x0093, B:22:0x009d, B:24:0x002e, B:26:0x0036, B:28:0x003e, B:29:0x0042, B:31:0x004a), top: B:2:0x0008 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m48085i(String str, String str2, String str3, boolean z11, boolean z12, Context context, c cVar) {
        String m48083g;
        try {
            ContactProfile contactProfile = new ContactProfile();
            contactProfile.f42434r = str;
            contactProfile.f42446v = str2;
            contactProfile.f42437s = str3;
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(contactProfile.f42437s)) {
                }
                m48083g = m48083g(contactProfile, z11, z12);
                if (!new File(m48083g).exists()) {
                    C23528a c23528a = new C23528a(context);
                    C3977j c3977j = new C3977j(context);
                    this.f48123a.add(c3977j);
                    ((C23528a) c23528a.m123612r(c3977j)).m123579C(m48083g, C23278z2.m120143n(), new a(c3977j, cVar, str));
                    return;
                }
                if ((TextUtils.isEmpty(contactProfile.f42446v) || C23302b.f113247a.m120523d(contactProfile.f42446v)) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                    int m12307a = C2343e.m12307a(str, false);
                    m48082e(contactProfile, z11, z12, cVar, C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false)), m12307a), context);
                    return;
                } else {
                    C23528a c23528a2 = new C23528a(context);
                    C3977j c3977j2 = new C3977j(context);
                    this.f48123a.add(c3977j2);
                    ((C23528a) c23528a2.m123612r(c3977j2)).m123579C(contactProfile.f42446v, C23278z2.m120143n(), new b(c3977j2, contactProfile, z11, z12, cVar, context, str));
                    return;
                }
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                if (TextUtils.isEmpty(contactProfile.f42446v)) {
                    contactProfile.f42446v = m141809c.f42446v;
                }
                if (TextUtils.isEmpty(contactProfile.f42437s)) {
                    contactProfile.f42437s = m141809c.f42437s;
                }
            }
            m48083g = m48083g(contactProfile, z11, z12);
            if (!new File(m48083g).exists()) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            if (cVar != null) {
                cVar.mo48079a(str, null);
            }
        }
    }

    /* renamed from: b */
    public void m48086b(final String str, final String str2, final String str3, final boolean z11, final boolean z12, final c cVar, final Context context) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.location.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                C8988g.this.m48085i(str, str2, str3, z11, z12, context, cVar);
            }
        });
    }

    /* renamed from: c */
    public void m48087c() {
        synchronized (this.f48123a) {
            try {
                Iterator it = this.f48123a.iterator();
                while (it.hasNext()) {
                    ((C3977j) it.next()).setImageInfo(null);
                }
                this.f48123a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f48124b.clear();
    }

    /* renamed from: f */
    public Bitmap m48088f(Context context, boolean z11, boolean z12) {
        String str = z11 + "_" + z12;
        Bitmap bitmap = (Bitmap) this.f48124b.get(str);
        if (bitmap == null) {
            Bitmap m48081d = m48081d(z11, z12, AbstractC23136l9.m118665N(context, AbstractC16803z.default_avatar2), context);
            this.f48124b.put(str, m48081d);
            return m48081d;
        }
        return bitmap;
    }
}
