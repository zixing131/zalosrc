package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C1020a();

    /* renamed from: p */
    private final IntentSender f3615p;

    /* renamed from: q */
    private final Intent f3616q;

    /* renamed from: r */
    private final int f3617r;

    /* renamed from: s */
    private final int f3618s;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* loaded from: classes2.dex */
    class C1020a implements Parcelable.Creator {
        C1020a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i11) {
            return new IntentSenderRequest[i11];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    /* loaded from: classes2.dex */
    public static final class C1021b {

        /* renamed from: a */
        private IntentSender f3619a;

        /* renamed from: b */
        private Intent f3620b;

        /* renamed from: c */
        private int f3621c;

        /* renamed from: d */
        private int f3622d;

        public C1021b(IntentSender intentSender) {
            this.f3619a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m4691a() {
            return new IntentSenderRequest(this.f3619a, this.f3620b, this.f3621c, this.f3622d);
        }

        public C1021b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i11, int i12) {
        this.f3615p = intentSender;
        this.f3616q = intent;
        this.f3617r = i11;
        this.f3618s = i12;
    }

    /* renamed from: a */
    public Intent m4685a() {
        return this.f3616q;
    }

    /* renamed from: b */
    public int m4686b() {
        return this.f3617r;
    }

    /* renamed from: c */
    public int m4687c() {
        return this.f3618s;
    }

    /* renamed from: d */
    public IntentSender m4688d() {
        return this.f3615p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f3615p, i11);
        parcel.writeParcelable(this.f3616q, i11);
        parcel.writeInt(this.f3617r);
        parcel.writeInt(this.f3618s);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f3615p = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f3616q = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f3617r = parcel.readInt();
        this.f3618s = parcel.readInt();
    }
}
