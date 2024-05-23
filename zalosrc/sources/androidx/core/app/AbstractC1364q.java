package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.content.C1390c;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C1462a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p176g1.AbstractC19200b;

/* renamed from: androidx.core.app.q */
/* loaded from: classes2.dex */
public abstract class AbstractC1364q {

    /* renamed from: androidx.core.app.q$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        final Bundle f5978a;

        /* renamed from: b */
        private IconCompat f5979b;

        /* renamed from: c */
        private final C1347i1[] f5980c;

        /* renamed from: d */
        private final C1347i1[] f5981d;

        /* renamed from: e */
        private boolean f5982e;

        /* renamed from: f */
        boolean f5983f;

        /* renamed from: g */
        private final int f5984g;

        /* renamed from: h */
        private final boolean f5985h;

        /* renamed from: i */
        public int f5986i;

        /* renamed from: j */
        public CharSequence f5987j;

        /* renamed from: k */
        public PendingIntent f5988k;

        /* renamed from: l */
        private boolean f5989l;

        /* renamed from: androidx.core.app.q$b$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private final IconCompat f5990a;

            /* renamed from: b */
            private final CharSequence f5991b;

            /* renamed from: c */
            private final PendingIntent f5992c;

            /* renamed from: d */
            private boolean f5993d;

            /* renamed from: e */
            private final Bundle f5994e;

            /* renamed from: f */
            private ArrayList f5995f;

            /* renamed from: g */
            private int f5996g;

            /* renamed from: h */
            private boolean f5997h;

            /* renamed from: i */
            private boolean f5998i;

            /* renamed from: j */
            private boolean f5999j;

            public a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i11 != 0 ? IconCompat.m7156i(null, "", i11) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: c */
            private void m6809c() {
                if (!this.f5998i || this.f5992c != null) {
                } else {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* renamed from: a */
            public a m6810a(C1347i1 c1347i1) {
                if (this.f5995f == null) {
                    this.f5995f = new ArrayList();
                }
                if (c1347i1 != null) {
                    this.f5995f.add(c1347i1);
                }
                return this;
            }

            /* renamed from: b */
            public b m6811b() {
                C1347i1[] c1347i1Arr;
                m6809c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f5995f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C1347i1 c1347i1 = (C1347i1) it.next();
                        if (c1347i1.m6759k()) {
                            arrayList.add(c1347i1);
                        } else {
                            arrayList2.add(c1347i1);
                        }
                    }
                }
                C1347i1[] c1347i1Arr2 = null;
                if (arrayList.isEmpty()) {
                    c1347i1Arr = null;
                } else {
                    c1347i1Arr = (C1347i1[]) arrayList.toArray(new C1347i1[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    c1347i1Arr2 = (C1347i1[]) arrayList2.toArray(new C1347i1[arrayList2.size()]);
                }
                return new b(this.f5990a, this.f5991b, this.f5992c, this.f5994e, c1347i1Arr2, c1347i1Arr, this.f5993d, this.f5996g, this.f5997h, this.f5998i, this.f5999j);
            }

            /* renamed from: d */
            public a m6812d(boolean z11) {
                this.f5993d = z11;
                return this;
            }

            /* renamed from: e */
            public a m6813e(int i11) {
                this.f5996g = i11;
                return this;
            }

            /* renamed from: f */
            public a m6814f(boolean z11) {
                this.f5997h = z11;
                return this;
            }

            private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1347i1[] c1347i1Arr, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
                this.f5993d = true;
                this.f5997h = true;
                this.f5990a = iconCompat;
                this.f5991b = f.m6847k(charSequence);
                this.f5992c = pendingIntent;
                this.f5994e = bundle;
                this.f5995f = c1347i1Arr == null ? null : new ArrayList(Arrays.asList(c1347i1Arr));
                this.f5993d = z11;
                this.f5996g = i11;
                this.f5997h = z12;
                this.f5998i = z13;
                this.f5999j = z14;
            }
        }

        public b(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.m7156i(null, "", i11) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m6799a() {
            return this.f5988k;
        }

        /* renamed from: b */
        public boolean m6800b() {
            return this.f5982e;
        }

        /* renamed from: c */
        public Bundle m6801c() {
            return this.f5978a;
        }

        /* renamed from: d */
        public IconCompat m6802d() {
            int i11;
            if (this.f5979b == null && (i11 = this.f5986i) != 0) {
                this.f5979b = IconCompat.m7156i(null, "", i11);
            }
            return this.f5979b;
        }

        /* renamed from: e */
        public C1347i1[] m6803e() {
            return this.f5980c;
        }

        /* renamed from: f */
        public int m6804f() {
            return this.f5984g;
        }

        /* renamed from: g */
        public boolean m6805g() {
            return this.f5983f;
        }

        /* renamed from: h */
        public CharSequence m6806h() {
            return this.f5987j;
        }

        /* renamed from: i */
        public boolean m6807i() {
            return this.f5989l;
        }

        /* renamed from: j */
        public boolean m6808j() {
            return this.f5985h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1347i1[] c1347i1Arr, C1347i1[] c1347i1Arr2, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
            this.f5983f = true;
            this.f5979b = iconCompat;
            if (iconCompat != null && iconCompat.m7161m() == 2) {
                this.f5986i = iconCompat.m7159k();
            }
            this.f5987j = f.m6847k(charSequence);
            this.f5988k = pendingIntent;
            this.f5978a = bundle == null ? new Bundle() : bundle;
            this.f5980c = c1347i1Arr;
            this.f5981d = c1347i1Arr2;
            this.f5982e = z11;
            this.f5984g = i11;
            this.f5983f = z12;
            this.f5985h = z13;
            this.f5989l = z14;
        }
    }

    /* renamed from: androidx.core.app.q$c */
    /* loaded from: classes2.dex */
    public static class c extends j {

        /* renamed from: e */
        private IconCompat f6000e;

        /* renamed from: f */
        private IconCompat f6001f;

        /* renamed from: g */
        private boolean f6002g;

        /* renamed from: h */
        private CharSequence f6003h;

        /* renamed from: i */
        private boolean f6004i;

        /* renamed from: androidx.core.app.q$c$a */
        /* loaded from: classes2.dex */
        private static class a {
            /* renamed from: a */
            static void m6821a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m6822b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.q$c$b */
        /* loaded from: classes2.dex */
        private static class b {
            /* renamed from: a */
            static void m6823a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.q$c$c */
        /* loaded from: classes2.dex */
        private static class C32625c {
            /* renamed from: a */
            static void m6824a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            static void m6825b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m6826c(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        public c() {
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: b */
        public void mo6815b(InterfaceC1362p interfaceC1362p) {
            Context context;
            int i11 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC1362p.mo6656a()).setBigContentTitle(this.f6082b);
            IconCompat iconCompat = this.f6000e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i11 >= 31) {
                    if (interfaceC1362p instanceof C1326b1) {
                        context = ((C1326b1) interfaceC1362p).m6659f();
                    } else {
                        context = null;
                    }
                    C32625c.m6824a(bigContentTitle, this.f6000e.m7168t(context));
                } else if (iconCompat.m7161m() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f6000e.m7158j());
                }
            }
            if (this.f6002g) {
                IconCompat iconCompat2 = this.f6001f;
                if (iconCompat2 == null) {
                    a.m6821a(bigContentTitle, null);
                } else if (i11 >= 23) {
                    if (interfaceC1362p instanceof C1326b1) {
                        context2 = ((C1326b1) interfaceC1362p).m6659f();
                    }
                    b.m6823a(bigContentTitle, this.f6001f.m7168t(context2));
                } else if (iconCompat2.m7161m() == 1) {
                    a.m6821a(bigContentTitle, this.f6001f.m7158j());
                } else {
                    a.m6821a(bigContentTitle, null);
                }
            }
            if (this.f6084d) {
                a.m6822b(bigContentTitle, this.f6083c);
            }
            if (i11 >= 31) {
                C32625c.m6826c(bigContentTitle, this.f6004i);
                C32625c.m6825b(bigContentTitle, this.f6003h);
            }
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: c */
        protected String mo6816c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public c m6817h(Bitmap bitmap) {
            IconCompat m7153f;
            if (bitmap == null) {
                m7153f = null;
            } else {
                m7153f = IconCompat.m7153f(bitmap);
            }
            this.f6001f = m7153f;
            this.f6002g = true;
            return this;
        }

        /* renamed from: i */
        public c m6818i(Bitmap bitmap) {
            IconCompat m7153f;
            if (bitmap == null) {
                m7153f = null;
            } else {
                m7153f = IconCompat.m7153f(bitmap);
            }
            this.f6000e = m7153f;
            return this;
        }

        /* renamed from: j */
        public c m6819j(CharSequence charSequence) {
            this.f6082b = f.m6847k(charSequence);
            return this;
        }

        /* renamed from: k */
        public c m6820k(CharSequence charSequence) {
            this.f6083c = f.m6847k(charSequence);
            this.f6084d = true;
            return this;
        }

        public c(f fVar) {
            m6919g(fVar);
        }
    }

    /* renamed from: androidx.core.app.q$d */
    /* loaded from: classes2.dex */
    public static class d extends j {

        /* renamed from: e */
        private CharSequence f6005e;

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: a */
        public void mo6827a(Bundle bundle) {
            super.mo6827a(bundle);
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: b */
        public void mo6815b(InterfaceC1362p interfaceC1362p) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC1362p.mo6656a()).setBigContentTitle(this.f6082b).bigText(this.f6005e);
            if (this.f6084d) {
                bigText.setSummaryText(this.f6083c);
            }
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: c */
        protected String mo6816c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public d m6828h(CharSequence charSequence) {
            this.f6005e = f.m6847k(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.q$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        private PendingIntent f6006a;

        /* renamed from: b */
        private PendingIntent f6007b;

        /* renamed from: c */
        private IconCompat f6008c;

        /* renamed from: d */
        private int f6009d;

        /* renamed from: e */
        private int f6010e;

        /* renamed from: f */
        private int f6011f;

        /* renamed from: g */
        private String f6012g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.q$e$a */
        /* loaded from: classes2.dex */
        public static class a {
            /* renamed from: a */
            static Notification.BubbleMetadata m6839a(e eVar) {
                if (eVar == null || eVar.m6835f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(eVar.m6834e().m7167s()).setIntent(eVar.m6835f()).setDeleteIntent(eVar.m6831b()).setAutoExpandBubble(eVar.m6830a()).setSuppressNotification(eVar.m6837h());
                if (eVar.m6832c() != 0) {
                    suppressNotification.setDesiredHeight(eVar.m6832c());
                }
                if (eVar.m6833d() != 0) {
                    suppressNotification.setDesiredHeightResId(eVar.m6833d());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.q$e$b */
        /* loaded from: classes2.dex */
        public static class b {
            /* renamed from: a */
            static Notification.BubbleMetadata m6840a(e eVar) {
                Notification.BubbleMetadata.Builder builder;
                if (eVar == null) {
                    return null;
                }
                if (eVar.m6836g() != null) {
                    builder = new Notification.BubbleMetadata.Builder(eVar.m6836g());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(eVar.m6835f(), eVar.m6834e().m7167s());
                }
                builder.setDeleteIntent(eVar.m6831b()).setAutoExpandBubble(eVar.m6830a()).setSuppressNotification(eVar.m6837h());
                if (eVar.m6832c() != 0) {
                    builder.setDesiredHeight(eVar.m6832c());
                }
                if (eVar.m6833d() != 0) {
                    builder.setDesiredHeightResId(eVar.m6833d());
                }
                return builder.build();
            }
        }

        /* renamed from: androidx.core.app.q$e$c */
        /* loaded from: classes2.dex */
        public static final class c {

            /* renamed from: a */
            private PendingIntent f6013a;

            /* renamed from: b */
            private IconCompat f6014b;

            /* renamed from: c */
            private int f6015c;

            /* renamed from: d */
            private int f6016d;

            /* renamed from: e */
            private int f6017e;

            /* renamed from: f */
            private PendingIntent f6018f;

            /* renamed from: g */
            private String f6019g;

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent != null) {
                    if (iconCompat != null) {
                        this.f6013a = pendingIntent;
                        this.f6014b = iconCompat;
                        return;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new NullPointerException("Bubble requires non-null pending intent");
            }

            /* renamed from: d */
            private c m6841d(int i11, boolean z11) {
                if (z11) {
                    this.f6017e = i11 | this.f6017e;
                } else {
                    this.f6017e = (~i11) & this.f6017e;
                }
                return this;
            }

            /* renamed from: a */
            public e m6842a() {
                String str = this.f6019g;
                if (str == null && this.f6013a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f6014b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                e eVar = new e(this.f6013a, this.f6018f, this.f6014b, this.f6015c, this.f6016d, this.f6017e, str);
                eVar.m6838i(this.f6017e);
                return eVar;
            }

            /* renamed from: b */
            public c m6843b(boolean z11) {
                m6841d(1, z11);
                return this;
            }

            /* renamed from: c */
            public c m6844c(int i11) {
                this.f6015c = Math.max(i11, 0);
                this.f6016d = 0;
                return this;
            }

            /* renamed from: e */
            public c m6845e(boolean z11) {
                m6841d(2, z11);
                return this;
            }
        }

        /* synthetic */ e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i11, int i12, int i13, String str, a aVar) {
            this(pendingIntent, pendingIntent2, iconCompat, i11, i12, i13, str);
        }

        /* renamed from: j */
        public static Notification.BubbleMetadata m6829j(e eVar) {
            if (eVar == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return b.m6840a(eVar);
            }
            if (i11 != 29) {
                return null;
            }
            return a.m6839a(eVar);
        }

        /* renamed from: a */
        public boolean m6830a() {
            return (this.f6011f & 1) != 0;
        }

        /* renamed from: b */
        public PendingIntent m6831b() {
            return this.f6007b;
        }

        /* renamed from: c */
        public int m6832c() {
            return this.f6009d;
        }

        /* renamed from: d */
        public int m6833d() {
            return this.f6010e;
        }

        /* renamed from: e */
        public IconCompat m6834e() {
            return this.f6008c;
        }

        /* renamed from: f */
        public PendingIntent m6835f() {
            return this.f6006a;
        }

        /* renamed from: g */
        public String m6836g() {
            return this.f6012g;
        }

        /* renamed from: h */
        public boolean m6837h() {
            return (this.f6011f & 2) != 0;
        }

        /* renamed from: i */
        public void m6838i(int i11) {
            this.f6011f = i11;
        }

        private e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i11, int i12, int i13, String str) {
            this.f6006a = pendingIntent;
            this.f6008c = iconCompat;
            this.f6009d = i11;
            this.f6010e = i12;
            this.f6007b = pendingIntent2;
            this.f6011f = i13;
            this.f6012g = str;
        }
    }

    /* renamed from: androidx.core.app.q$g */
    /* loaded from: classes2.dex */
    public interface g {
        /* renamed from: a */
        f mo6899a(f fVar);
    }

    /* renamed from: androidx.core.app.q$h */
    /* loaded from: classes2.dex */
    public static class h extends j {

        /* renamed from: e */
        private ArrayList f6069e = new ArrayList();

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: b */
        public void mo6815b(InterfaceC1362p interfaceC1362p) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC1362p.mo6656a()).setBigContentTitle(this.f6082b);
            if (this.f6084d) {
                bigContentTitle.setSummaryText(this.f6083c);
            }
            Iterator it = this.f6069e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: c */
        protected String mo6816c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public h m6900h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f6069e.add(f.m6847k(charSequence));
            }
            return this;
        }
    }

    /* renamed from: androidx.core.app.q$i */
    /* loaded from: classes2.dex */
    public static class i extends j {

        /* renamed from: e */
        private final List f6070e = new ArrayList();

        /* renamed from: f */
        private final List f6071f = new ArrayList();

        /* renamed from: g */
        private C1341g1 f6072g;

        /* renamed from: h */
        private CharSequence f6073h;

        /* renamed from: i */
        private Boolean f6074i;

        /* renamed from: androidx.core.app.q$i$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private final CharSequence f6075a;

            /* renamed from: b */
            private final long f6076b;

            /* renamed from: c */
            private final C1341g1 f6077c;

            /* renamed from: d */
            private Bundle f6078d = new Bundle();

            /* renamed from: e */
            private String f6079e;

            /* renamed from: f */
            private Uri f6080f;

            public a(CharSequence charSequence, long j11, C1341g1 c1341g1) {
                this.f6075a = charSequence;
                this.f6076b = j11;
                this.f6077c = c1341g1;
            }

            /* renamed from: a */
            static Bundle[] m6908a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    bundleArr[i11] = ((a) list.get(i11)).m6909h();
                }
                return bundleArr;
            }

            /* renamed from: h */
            private Bundle m6909h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f6075a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f6076b);
                C1341g1 c1341g1 = this.f6077c;
                if (c1341g1 != null) {
                    bundle.putCharSequence("sender", c1341g1.m6729c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f6077c.m6734h());
                    } else {
                        bundle.putBundle("person", this.f6077c.m6735i());
                    }
                }
                String str = this.f6079e;
                if (str != null) {
                    bundle.putString(ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
                }
                Uri uri = this.f6080f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f6078d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: b */
            public String m6910b() {
                return this.f6079e;
            }

            /* renamed from: c */
            public Uri m6911c() {
                return this.f6080f;
            }

            /* renamed from: d */
            public C1341g1 m6912d() {
                return this.f6077c;
            }

            /* renamed from: e */
            public CharSequence m6913e() {
                return this.f6075a;
            }

            /* renamed from: f */
            public long m6914f() {
                return this.f6076b;
            }

            /* renamed from: g */
            Notification.MessagingStyle.Message m6915g() {
                Notification.MessagingStyle.Message m6633a;
                C1341g1 m6912d = m6912d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    AbstractC1325b0.m6651a();
                    CharSequence m6913e = m6913e();
                    long m6914f = m6914f();
                    if (m6912d != null) {
                        person = m6912d.m6734h();
                    }
                    m6633a = AbstractC1382z.m6943a(m6913e, m6914f, person);
                } else {
                    AbstractC1325b0.m6651a();
                    CharSequence m6913e2 = m6913e();
                    long m6914f2 = m6914f();
                    if (m6912d != null) {
                        charSequence = m6912d.m6729c();
                    }
                    m6633a = AbstractC1322a0.m6633a(m6913e2, m6914f2, charSequence);
                }
                if (m6910b() != null) {
                    m6633a.setData(m6910b(), m6911c());
                }
                return m6633a;
            }
        }

        public i(C1341g1 c1341g1) {
            if (!TextUtils.isEmpty(c1341g1.m6729c())) {
                this.f6072g = c1341g1;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        /* renamed from: i */
        private a m6901i() {
            for (int size = this.f6070e.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6070e.get(size);
                if (aVar.m6912d() != null && !TextUtils.isEmpty(aVar.m6912d().m6729c())) {
                    return aVar;
                }
            }
            if (!this.f6070e.isEmpty()) {
                return (a) this.f6070e.get(r0.size() - 1);
            }
            return null;
        }

        /* renamed from: j */
        private boolean m6902j() {
            for (int size = this.f6070e.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6070e.get(size);
                if (aVar.m6912d() != null && aVar.m6912d().m6729c() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        private TextAppearanceSpan m6903l(int i11) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i11), null);
        }

        /* renamed from: m */
        private CharSequence m6904m(a aVar) {
            CharSequence m6729c;
            C1462a m7419c = C1462a.m7419c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (aVar.m6912d() == null) {
                m6729c = "";
            } else {
                m6729c = aVar.m6912d().m6729c();
            }
            int i11 = -16777216;
            if (TextUtils.isEmpty(m6729c)) {
                m6729c = this.f6072g.m6729c();
                if (this.f6081a.m6883i() != 0) {
                    i11 = this.f6081a.m6883i();
                }
            }
            CharSequence m7424h = m7419c.m7424h(m6729c);
            spannableStringBuilder.append(m7424h);
            spannableStringBuilder.setSpan(m6903l(i11), spannableStringBuilder.length() - m7424h.length(), spannableStringBuilder.length(), 33);
            if (aVar.m6913e() != null) {
                charSequence = aVar.m6913e();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(m7419c.m7424h(charSequence));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: a */
        public void mo6827a(Bundle bundle) {
            super.mo6827a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f6072g.m6729c());
            bundle.putBundle("android.messagingStyleUser", this.f6072g.m6735i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f6073h);
            if (this.f6073h != null && this.f6074i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f6073h);
            }
            if (!this.f6070e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.m6908a(this.f6070e));
            }
            if (!this.f6071f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.m6908a(this.f6071f));
            }
            Boolean bool = this.f6074i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: b */
        public void mo6815b(InterfaceC1362p interfaceC1362p) {
            boolean z11;
            CharSequence m6913e;
            CharSequence m6913e2;
            Notification.MessagingStyle m6939a;
            m6907n(m6906k());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                if (i11 >= 28) {
                    AbstractC1380y.m6941a();
                    m6939a = AbstractC1376w.m6937a(this.f6072g.m6734h());
                } else {
                    AbstractC1380y.m6941a();
                    m6939a = AbstractC1378x.m6939a(this.f6072g.m6729c());
                }
                Iterator it = this.f6070e.iterator();
                while (it.hasNext()) {
                    m6939a.addMessage(((a) it.next()).m6915g());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it2 = this.f6071f.iterator();
                    while (it2.hasNext()) {
                        m6939a.addHistoricMessage(((a) it2.next()).m6915g());
                    }
                }
                if (this.f6074i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    m6939a.setConversationTitle(this.f6073h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    m6939a.setGroupConversation(this.f6074i.booleanValue());
                }
                m6939a.setBuilder(interfaceC1362p.mo6656a());
                return;
            }
            a m6901i = m6901i();
            if (this.f6073h != null && this.f6074i.booleanValue()) {
                interfaceC1362p.mo6656a().setContentTitle(this.f6073h);
            } else if (m6901i != null) {
                interfaceC1362p.mo6656a().setContentTitle("");
                if (m6901i.m6912d() != null) {
                    interfaceC1362p.mo6656a().setContentTitle(m6901i.m6912d().m6729c());
                }
            }
            if (m6901i != null) {
                Notification.Builder mo6656a = interfaceC1362p.mo6656a();
                if (this.f6073h != null) {
                    m6913e2 = m6904m(m6901i);
                } else {
                    m6913e2 = m6901i.m6913e();
                }
                mo6656a.setContentText(m6913e2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f6073h == null && !m6902j()) {
                z11 = false;
            } else {
                z11 = true;
            }
            for (int size = this.f6070e.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6070e.get(size);
                if (z11) {
                    m6913e = m6904m(aVar);
                } else {
                    m6913e = aVar.m6913e();
                }
                if (size != this.f6070e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, m6913e);
            }
            new Notification.BigTextStyle(interfaceC1362p.mo6656a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // androidx.core.app.AbstractC1364q.j
        /* renamed from: c */
        protected String mo6816c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* renamed from: h */
        public i m6905h(a aVar) {
            if (aVar != null) {
                this.f6070e.add(aVar);
                if (this.f6070e.size() > 25) {
                    this.f6070e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: k */
        public boolean m6906k() {
            f fVar = this.f6081a;
            if (fVar != null && fVar.f6043a.getApplicationInfo().targetSdkVersion < 28 && this.f6074i == null) {
                if (this.f6073h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f6074i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* renamed from: n */
        public i m6907n(boolean z11) {
            this.f6074i = Boolean.valueOf(z11);
            return this;
        }
    }

    /* renamed from: androidx.core.app.q$j */
    /* loaded from: classes2.dex */
    public static abstract class j {

        /* renamed from: a */
        protected f f6081a;

        /* renamed from: b */
        CharSequence f6082b;

        /* renamed from: c */
        CharSequence f6083c;

        /* renamed from: d */
        boolean f6084d = false;

        /* renamed from: a */
        public void mo6827a(Bundle bundle) {
            if (this.f6084d) {
                bundle.putCharSequence("android.summaryText", this.f6083c);
            }
            CharSequence charSequence = this.f6082b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo6816c = mo6816c();
            if (mo6816c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo6816c);
            }
        }

        /* renamed from: b */
        public abstract void mo6815b(InterfaceC1362p interfaceC1362p);

        /* renamed from: c */
        protected abstract String mo6816c();

        /* renamed from: d */
        public RemoteViews m6916d(InterfaceC1362p interfaceC1362p) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m6917e(InterfaceC1362p interfaceC1362p) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m6918f(InterfaceC1362p interfaceC1362p) {
            return null;
        }

        /* renamed from: g */
        public void m6919g(f fVar) {
            if (this.f6081a != fVar) {
                this.f6081a = fVar;
                if (fVar != null) {
                    fVar.m6869V(this);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.q$k */
    /* loaded from: classes2.dex */
    public static final class k implements g {

        /* renamed from: c */
        private PendingIntent f6087c;

        /* renamed from: e */
        private Bitmap f6089e;

        /* renamed from: f */
        private int f6090f;

        /* renamed from: j */
        private int f6094j;

        /* renamed from: l */
        private int f6096l;

        /* renamed from: m */
        private String f6097m;

        /* renamed from: n */
        private String f6098n;

        /* renamed from: a */
        private ArrayList f6085a = new ArrayList();

        /* renamed from: b */
        private int f6086b = 1;

        /* renamed from: d */
        private ArrayList f6088d = new ArrayList();

        /* renamed from: g */
        private int f6091g = 8388613;

        /* renamed from: h */
        private int f6092h = -1;

        /* renamed from: i */
        private int f6093i = 0;

        /* renamed from: k */
        private int f6095k = 80;

        /* renamed from: d */
        private static Notification.Action m6920d(b bVar) {
            int i11;
            Notification.Action.Builder builder;
            Bundle bundle;
            Icon m7167s;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23) {
                IconCompat m6802d = bVar.m6802d();
                AbstractC1340g0.m6726a();
                if (m6802d == null) {
                    m7167s = null;
                } else {
                    m7167s = m6802d.m7167s();
                }
                builder = AbstractC1337f0.m6716a(m7167s, bVar.m6806h(), bVar.m6799a());
            } else {
                IconCompat m6802d2 = bVar.m6802d();
                if (m6802d2 != null && m6802d2.m7161m() == 2) {
                    i11 = m6802d2.m7159k();
                } else {
                    i11 = 0;
                }
                builder = new Notification.Action.Builder(i11, bVar.m6806h(), bVar.m6799a());
            }
            if (bVar.m6801c() != null) {
                bundle = new Bundle(bVar.m6801c());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.m6800b());
            if (i12 >= 24) {
                builder.setAllowGeneratedReplies(bVar.m6800b());
            }
            if (i12 >= 31) {
                builder.setAuthenticationRequired(bVar.m6807i());
            }
            builder.addExtras(bundle);
            C1347i1[] m6803e = bVar.m6803e();
            if (m6803e != null) {
                for (RemoteInput remoteInput : C1347i1.m6750b(m6803e)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        /* renamed from: f */
        private void m6921f(int i11, boolean z11) {
            if (z11) {
                this.f6086b = i11 | this.f6086b;
            } else {
                this.f6086b = (~i11) & this.f6086b;
            }
        }

        @Override // androidx.core.app.AbstractC1364q.g
        /* renamed from: a */
        public f mo6899a(f fVar) {
            Bundle bundle = new Bundle();
            if (!this.f6085a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f6085a.size());
                Iterator it = this.f6085a.iterator();
                while (it.hasNext()) {
                    arrayList.add(m6920d((b) it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i11 = this.f6086b;
            if (i11 != 1) {
                bundle.putInt("flags", i11);
            }
            PendingIntent pendingIntent = this.f6087c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f6088d.isEmpty()) {
                ArrayList arrayList2 = this.f6088d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f6089e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i12 = this.f6090f;
            if (i12 != 0) {
                bundle.putInt("contentIcon", i12);
            }
            int i13 = this.f6091g;
            if (i13 != 8388613) {
                bundle.putInt("contentIconGravity", i13);
            }
            int i14 = this.f6092h;
            if (i14 != -1) {
                bundle.putInt("contentActionIndex", i14);
            }
            int i15 = this.f6093i;
            if (i15 != 0) {
                bundle.putInt("customSizePreset", i15);
            }
            int i16 = this.f6094j;
            if (i16 != 0) {
                bundle.putInt("customContentHeight", i16);
            }
            int i17 = this.f6095k;
            if (i17 != 80) {
                bundle.putInt("gravity", i17);
            }
            int i18 = this.f6096l;
            if (i18 != 0) {
                bundle.putInt("hintScreenTimeout", i18);
            }
            String str = this.f6097m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f6098n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            fVar.m6884j().putBundle("android.wearable.EXTENSIONS", bundle);
            return fVar;
        }

        /* renamed from: b */
        public k m6922b(b bVar) {
            this.f6085a.add(bVar);
            return this;
        }

        /* renamed from: c */
        public k clone() {
            k kVar = new k();
            kVar.f6085a = new ArrayList(this.f6085a);
            kVar.f6086b = this.f6086b;
            kVar.f6087c = this.f6087c;
            kVar.f6088d = new ArrayList(this.f6088d);
            kVar.f6089e = this.f6089e;
            kVar.f6090f = this.f6090f;
            kVar.f6091g = this.f6091g;
            kVar.f6092h = this.f6092h;
            kVar.f6093i = this.f6093i;
            kVar.f6094j = this.f6094j;
            kVar.f6095k = this.f6095k;
            kVar.f6096l = this.f6096l;
            kVar.f6097m = this.f6097m;
            kVar.f6098n = this.f6098n;
            return kVar;
        }

        /* renamed from: e */
        public k m6924e(Bitmap bitmap) {
            this.f6089e = bitmap;
            return this;
        }

        /* renamed from: g */
        public k m6925g(boolean z11) {
            m6921f(2, z11);
            return this;
        }
    }

    /* renamed from: a */
    public static Bundle m6798a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: androidx.core.app.q$f */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: A */
        boolean f6020A;

        /* renamed from: B */
        boolean f6021B;

        /* renamed from: C */
        String f6022C;

        /* renamed from: D */
        Bundle f6023D;

        /* renamed from: E */
        int f6024E;

        /* renamed from: F */
        int f6025F;

        /* renamed from: G */
        Notification f6026G;

        /* renamed from: H */
        RemoteViews f6027H;

        /* renamed from: I */
        RemoteViews f6028I;

        /* renamed from: J */
        RemoteViews f6029J;

        /* renamed from: K */
        String f6030K;

        /* renamed from: L */
        int f6031L;

        /* renamed from: M */
        String f6032M;

        /* renamed from: N */
        C1390c f6033N;

        /* renamed from: O */
        long f6034O;

        /* renamed from: P */
        int f6035P;

        /* renamed from: Q */
        int f6036Q;

        /* renamed from: R */
        boolean f6037R;

        /* renamed from: S */
        e f6038S;

        /* renamed from: T */
        Notification f6039T;

        /* renamed from: U */
        boolean f6040U;

        /* renamed from: V */
        Icon f6041V;

        /* renamed from: W */
        public ArrayList f6042W;

        /* renamed from: a */
        public Context f6043a;

        /* renamed from: b */
        public ArrayList f6044b;

        /* renamed from: c */
        public ArrayList f6045c;

        /* renamed from: d */
        ArrayList f6046d;

        /* renamed from: e */
        CharSequence f6047e;

        /* renamed from: f */
        CharSequence f6048f;

        /* renamed from: g */
        PendingIntent f6049g;

        /* renamed from: h */
        PendingIntent f6050h;

        /* renamed from: i */
        RemoteViews f6051i;

        /* renamed from: j */
        Bitmap f6052j;

        /* renamed from: k */
        CharSequence f6053k;

        /* renamed from: l */
        int f6054l;

        /* renamed from: m */
        int f6055m;

        /* renamed from: n */
        boolean f6056n;

        /* renamed from: o */
        boolean f6057o;

        /* renamed from: p */
        j f6058p;

        /* renamed from: q */
        CharSequence f6059q;

        /* renamed from: r */
        CharSequence f6060r;

        /* renamed from: s */
        CharSequence[] f6061s;

        /* renamed from: t */
        int f6062t;

        /* renamed from: u */
        int f6063u;

        /* renamed from: v */
        boolean f6064v;

        /* renamed from: w */
        String f6065w;

        /* renamed from: x */
        boolean f6066x;

        /* renamed from: y */
        String f6067y;

        /* renamed from: z */
        boolean f6068z;

        public f(Context context, String str) {
            this.f6044b = new ArrayList();
            this.f6045c = new ArrayList();
            this.f6046d = new ArrayList();
            this.f6056n = true;
            this.f6068z = false;
            this.f6024E = 0;
            this.f6025F = 0;
            this.f6031L = 0;
            this.f6035P = 0;
            this.f6036Q = 0;
            Notification notification = new Notification();
            this.f6039T = notification;
            this.f6043a = context;
            this.f6030K = str;
            notification.when = System.currentTimeMillis();
            this.f6039T.audioStreamType = -1;
            this.f6055m = 0;
            this.f6042W = new ArrayList();
            this.f6037R = true;
        }

        /* renamed from: D */
        private void m6846D(int i11, boolean z11) {
            if (z11) {
                Notification notification = this.f6039T;
                notification.flags = i11 | notification.flags;
            } else {
                Notification notification2 = this.f6039T;
                notification2.flags = (~i11) & notification2.flags;
            }
        }

        /* renamed from: k */
        protected static CharSequence m6847k(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: l */
        private Bitmap m6848l(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f6043a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC19200b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC19200b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        /* renamed from: A */
        public f m6849A(int i11) {
            Notification notification = this.f6039T;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: B */
        public f m6850B(PendingIntent pendingIntent) {
            this.f6039T.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: C */
        public f m6851C(Bundle bundle) {
            this.f6023D = bundle;
            return this;
        }

        /* renamed from: E */
        public f m6852E(PendingIntent pendingIntent, boolean z11) {
            this.f6050h = pendingIntent;
            m6846D(128, z11);
            return this;
        }

        /* renamed from: F */
        public f m6853F(String str) {
            this.f6065w = str;
            return this;
        }

        /* renamed from: G */
        public f m6854G(boolean z11) {
            this.f6066x = z11;
            return this;
        }

        /* renamed from: H */
        public f mo6855H(Bitmap bitmap) {
            this.f6052j = m6848l(bitmap);
            return this;
        }

        /* renamed from: I */
        public f m6856I(int i11, int i12, int i13) {
            int i14;
            Notification notification = this.f6039T;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            if (i12 != 0 && i13 != 0) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            notification.flags = i14 | (notification.flags & (-2));
            return this;
        }

        /* renamed from: J */
        public f m6857J(boolean z11) {
            this.f6068z = z11;
            return this;
        }

        /* renamed from: K */
        public f m6858K(C1390c c1390c) {
            this.f6033N = c1390c;
            return this;
        }

        /* renamed from: L */
        public f m6859L(int i11) {
            this.f6054l = i11;
            return this;
        }

        /* renamed from: M */
        public f mo6860M(boolean z11) {
            m6846D(2, z11);
            return this;
        }

        /* renamed from: N */
        public f mo6861N(boolean z11) {
            m6846D(8, z11);
            return this;
        }

        /* renamed from: O */
        public f m6862O(int i11) {
            this.f6055m = i11;
            return this;
        }

        /* renamed from: P */
        public f m6863P(int i11, int i12, boolean z11) {
            this.f6062t = i11;
            this.f6063u = i12;
            this.f6064v = z11;
            return this;
        }

        /* renamed from: Q */
        public f m6864Q(String str) {
            this.f6032M = str;
            return this;
        }

        /* renamed from: R */
        public f m6865R(boolean z11) {
            this.f6056n = z11;
            return this;
        }

        /* renamed from: S */
        public f m6866S(int i11) {
            this.f6039T.icon = i11;
            return this;
        }

        /* renamed from: T */
        public f m6867T(Uri uri) {
            Notification notification = this.f6039T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: U */
        public f m6868U(Uri uri, int i11) {
            Notification notification = this.f6039T;
            notification.sound = uri;
            notification.audioStreamType = i11;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i11).build();
            return this;
        }

        /* renamed from: V */
        public f m6869V(j jVar) {
            if (this.f6058p != jVar) {
                this.f6058p = jVar;
                if (jVar != null) {
                    jVar.m6919g(this);
                }
            }
            return this;
        }

        /* renamed from: W */
        public f m6870W(CharSequence charSequence) {
            this.f6039T.tickerText = m6847k(charSequence);
            return this;
        }

        /* renamed from: X */
        public f m6871X(boolean z11) {
            this.f6057o = z11;
            return this;
        }

        /* renamed from: Y */
        public f m6872Y(long[] jArr) {
            this.f6039T.vibrate = jArr;
            return this;
        }

        /* renamed from: Z */
        public f m6873Z(int i11) {
            this.f6025F = i11;
            return this;
        }

        /* renamed from: a */
        public f m6874a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f6044b.add(new b(i11, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a0 */
        public f m6875a0(long j11) {
            this.f6039T.when = j11;
            return this;
        }

        /* renamed from: b */
        public f m6876b(b bVar) {
            if (bVar != null) {
                this.f6044b.add(bVar);
            }
            return this;
        }

        /* renamed from: c */
        public f m6877c(b bVar) {
            if (bVar != null) {
                this.f6046d.add(bVar);
            }
            return this;
        }

        /* renamed from: d */
        public f m6878d(C1341g1 c1341g1) {
            if (c1341g1 != null) {
                this.f6045c.add(c1341g1);
            }
            return this;
        }

        /* renamed from: e */
        public Notification mo6879e() {
            return new C1326b1(this).m6657c();
        }

        /* renamed from: f */
        public f m6880f() {
            this.f6044b.clear();
            return this;
        }

        /* renamed from: g */
        public f m6881g(g gVar) {
            gVar.mo6899a(this);
            return this;
        }

        /* renamed from: h */
        public e m6882h() {
            return this.f6038S;
        }

        /* renamed from: i */
        public int m6883i() {
            return this.f6024E;
        }

        /* renamed from: j */
        public Bundle m6884j() {
            if (this.f6023D == null) {
                this.f6023D = new Bundle();
            }
            return this.f6023D;
        }

        /* renamed from: m */
        public f m6885m(boolean z11) {
            this.f6037R = z11;
            return this;
        }

        /* renamed from: n */
        public f m6886n(boolean z11) {
            m6846D(16, z11);
            return this;
        }

        /* renamed from: o */
        public f m6887o(e eVar) {
            this.f6038S = eVar;
            return this;
        }

        /* renamed from: p */
        public f m6888p(String str) {
            this.f6022C = str;
            return this;
        }

        /* renamed from: q */
        public f mo6889q(String str) {
            this.f6030K = str;
            return this;
        }

        /* renamed from: r */
        public f m6890r(int i11) {
            this.f6024E = i11;
            return this;
        }

        /* renamed from: s */
        public f m6891s(boolean z11) {
            this.f6020A = z11;
            this.f6021B = true;
            return this;
        }

        /* renamed from: t */
        public f m6892t(CharSequence charSequence) {
            this.f6053k = m6847k(charSequence);
            return this;
        }

        /* renamed from: u */
        public f m6893u(PendingIntent pendingIntent) {
            this.f6049g = pendingIntent;
            return this;
        }

        /* renamed from: v */
        public f mo6894v(CharSequence charSequence) {
            this.f6048f = m6847k(charSequence);
            return this;
        }

        /* renamed from: w */
        public f mo6895w(CharSequence charSequence) {
            this.f6047e = m6847k(charSequence);
            return this;
        }

        /* renamed from: x */
        public f m6896x(RemoteViews remoteViews) {
            this.f6028I = remoteViews;
            return this;
        }

        /* renamed from: y */
        public f m6897y(RemoteViews remoteViews) {
            this.f6027H = remoteViews;
            return this;
        }

        /* renamed from: z */
        public f m6898z(RemoteViews remoteViews) {
            this.f6029J = remoteViews;
            return this;
        }

        public f(Context context) {
            this(context, null);
        }
    }
}
