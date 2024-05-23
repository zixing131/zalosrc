package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0976b;
import android.support.v4.media.AbstractC0979e;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0971a();

    /* renamed from: p */
    private final String f3481p;

    /* renamed from: q */
    private final CharSequence f3482q;

    /* renamed from: r */
    private final CharSequence f3483r;

    /* renamed from: s */
    private final CharSequence f3484s;

    /* renamed from: t */
    private final Bitmap f3485t;

    /* renamed from: u */
    private final Uri f3486u;

    /* renamed from: v */
    private final Bundle f3487v;

    /* renamed from: w */
    private final Uri f3488w;

    /* renamed from: x */
    private Object f3489x;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes2.dex */
    static class C0971a implements Parcelable.Creator {
        C0971a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m4537a(AbstractC0976b.m4560a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes2.dex */
    public static final class C0972b {

        /* renamed from: a */
        private String f3490a;

        /* renamed from: b */
        private CharSequence f3491b;

        /* renamed from: c */
        private CharSequence f3492c;

        /* renamed from: d */
        private CharSequence f3493d;

        /* renamed from: e */
        private Bitmap f3494e;

        /* renamed from: f */
        private Uri f3495f;

        /* renamed from: g */
        private Bundle f3496g;

        /* renamed from: h */
        private Uri f3497h;

        /* renamed from: a */
        public MediaDescriptionCompat m4541a() {
            return new MediaDescriptionCompat(this.f3490a, this.f3491b, this.f3492c, this.f3493d, this.f3494e, this.f3495f, this.f3496g, this.f3497h);
        }

        /* renamed from: b */
        public C0972b m4542b(CharSequence charSequence) {
            this.f3493d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0972b m4543c(Bundle bundle) {
            this.f3496g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0972b m4544d(Bitmap bitmap) {
            this.f3494e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0972b m4545e(Uri uri) {
            this.f3495f = uri;
            return this;
        }

        /* renamed from: f */
        public C0972b m4546f(String str) {
            this.f3490a = str;
            return this;
        }

        /* renamed from: g */
        public C0972b m4547g(Uri uri) {
            this.f3497h = uri;
            return this;
        }

        /* renamed from: h */
        public C0972b m4548h(CharSequence charSequence) {
            this.f3492c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0972b m4549i(CharSequence charSequence) {
            this.f3491b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3481p = str;
        this.f3482q = charSequence;
        this.f3483r = charSequence2;
        this.f3484s = charSequence3;
        this.f3485t = bitmap;
        this.f3486u = uri;
        this.f3487v = bundle;
        this.f3488w = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat m4537a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        C0972b c0972b = new C0972b();
        c0972b.m4546f(AbstractC0976b.m4565f(obj));
        c0972b.m4549i(AbstractC0976b.m4567h(obj));
        c0972b.m4548h(AbstractC0976b.m4566g(obj));
        c0972b.m4542b(AbstractC0976b.m4561b(obj));
        c0972b.m4544d(AbstractC0976b.m4563d(obj));
        c0972b.m4545e(AbstractC0976b.m4564e(obj));
        Bundle m4562c = AbstractC0976b.m4562c(obj);
        if (m4562c != null) {
            MediaSessionCompat.m4600a(m4562c);
            uri = (Uri) m4562c.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!m4562c.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || m4562c.size() != 2) {
                m4562c.remove("android.support.v4.media.description.MEDIA_URI");
                m4562c.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            c0972b.m4543c(bundle);
            if (uri == null) {
                c0972b.m4547g(uri);
            } else if (i11 >= 23) {
                c0972b.m4547g(AbstractC0979e.m4580a(obj));
            }
            MediaDescriptionCompat m4541a = c0972b.m4541a();
            m4541a.f3489x = obj;
            return m4541a;
        }
        bundle = m4562c;
        c0972b.m4543c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat m4541a2 = c0972b.m4541a();
        m4541a2.f3489x = obj;
        return m4541a2;
    }

    /* renamed from: b */
    public Object m4538b() {
        Object obj = this.f3489x;
        if (obj == null) {
            int i11 = Build.VERSION.SDK_INT;
            Object m4570b = AbstractC0976b.a.m4570b();
            AbstractC0976b.a.m4575g(m4570b, this.f3481p);
            AbstractC0976b.a.m4577i(m4570b, this.f3482q);
            AbstractC0976b.a.m4576h(m4570b, this.f3483r);
            AbstractC0976b.a.m4571c(m4570b, this.f3484s);
            AbstractC0976b.a.m4573e(m4570b, this.f3485t);
            AbstractC0976b.a.m4574f(m4570b, this.f3486u);
            Bundle bundle = this.f3487v;
            if (i11 < 23 && this.f3488w != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f3488w);
            }
            AbstractC0976b.a.m4572d(m4570b, bundle);
            if (i11 >= 23) {
                AbstractC0979e.a.m4581a(m4570b, this.f3488w);
            }
            Object m4569a = AbstractC0976b.a.m4569a(m4570b);
            this.f3489x = m4569a;
            return m4569a;
        }
        return obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f3482q) + ", " + ((Object) this.f3483r) + ", " + ((Object) this.f3484s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC0976b.m4568i(m4538b(), parcel, i11);
    }
}
