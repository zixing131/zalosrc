package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes2.dex */
public abstract class MediaSessionCompat {

    /* loaded from: classes2.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0985a();

        /* renamed from: p */
        private final MediaDescriptionCompat f3516p;

        /* renamed from: q */
        private final long f3517q;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes2.dex */
        static class C0985a implements Parcelable.Creator {
            C0985a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i11) {
                return new QueueItem[i11];
            }
        }

        QueueItem(Parcel parcel) {
            this.f3516p = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f3517q = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f3516p + ", Id=" + this.f3517q + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f3516p.writeToParcel(parcel, i11);
            parcel.writeLong(this.f3517q);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0986a();

        /* renamed from: p */
        ResultReceiver f3518p;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes2.dex */
        static class C0986a implements Parcelable.Creator {
            C0986a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i11) {
                return new ResultReceiverWrapper[i11];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f3518p = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f3518p.writeToParcel(parcel, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0987a();

        /* renamed from: p */
        private final Object f3519p;

        /* renamed from: q */
        private InterfaceC0992b f3520q;

        /* renamed from: r */
        private Bundle f3521r;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes2.dex */
        static class C0987a implements Parcelable.Creator {
            C0987a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i11) {
                return new Token[i11];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m4605a(Object obj) {
            return m4606b(obj, null);
        }

        /* renamed from: b */
        public static Token m4606b(Object obj, InterfaceC0992b interfaceC0992b) {
            if (obj != null) {
                return new Token(AbstractC0994d.m4623a(obj), interfaceC0992b);
            }
            return null;
        }

        /* renamed from: c */
        public InterfaceC0992b m4607c() {
            return this.f3520q;
        }

        /* renamed from: d */
        public Object m4608d() {
            return this.f3519p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void m4609e(InterfaceC0992b interfaceC0992b) {
            this.f3520q = interfaceC0992b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f3519p;
            if (obj2 == null) {
                if (token.f3519p == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f3519p;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: f */
        public void m4610f(Bundle bundle) {
            this.f3521r = bundle;
        }

        public int hashCode() {
            Object obj = this.f3519p;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeParcelable((Parcelable) this.f3519p, i11);
        }

        Token(Object obj, InterfaceC0992b interfaceC0992b) {
            this(obj, interfaceC0992b, null);
        }

        Token(Object obj, InterfaceC0992b interfaceC0992b, Bundle bundle) {
            this.f3519p = obj;
            this.f3520q = interfaceC0992b;
            this.f3521r = bundle;
        }
    }

    /* renamed from: a */
    public static void m4600a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
