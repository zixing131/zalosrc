package com.zing.zalo.camera.photocrop;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.zing.zalo.camera.photocrop.CropOverlayView;

/* loaded from: classes3.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C7711a();

    /* renamed from: A */
    public int f41422A;

    /* renamed from: B */
    public float f41423B;

    /* renamed from: C */
    public float f41424C;

    /* renamed from: D */
    public int f41425D;

    /* renamed from: E */
    public float f41426E;

    /* renamed from: F */
    public int f41427F;

    /* renamed from: G */
    public int f41428G;

    /* renamed from: H */
    public int f41429H;

    /* renamed from: I */
    public int f41430I;

    /* renamed from: p */
    public CropOverlayView.EnumC7713b f41431p;

    /* renamed from: q */
    public float f41432q;

    /* renamed from: r */
    public float f41433r;

    /* renamed from: s */
    public CropOverlayView.EnumC7714c f41434s;

    /* renamed from: t */
    public boolean f41435t;

    /* renamed from: u */
    public boolean f41436u;

    /* renamed from: v */
    public int f41437v;

    /* renamed from: w */
    public boolean f41438w;

    /* renamed from: x */
    public int f41439x;

    /* renamed from: y */
    public int f41440y;

    /* renamed from: z */
    public float f41441z;

    /* renamed from: com.zing.zalo.camera.photocrop.CropImageOptions$a */
    /* loaded from: classes3.dex */
    class C7711a implements Parcelable.Creator {
        C7711a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CropImageOptions[] newArray(int i11) {
            return new CropImageOptions[i11];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f41431p = CropOverlayView.EnumC7713b.RECTANGLE;
        this.f41432q = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f41433r = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f41434s = CropOverlayView.EnumC7714c.ON_TOUCH;
        this.f41435t = true;
        this.f41436u = true;
        this.f41437v = 4;
        this.f41438w = false;
        this.f41439x = 1;
        this.f41440y = 1;
        this.f41441z = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f41422A = Color.argb(170, 255, 255, 255);
        this.f41423B = TypedValue.applyDimension(1, 4.0f, displayMetrics);
        this.f41424C = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f41425D = -1;
        this.f41426E = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f41427F = Color.argb(170, 255, 255, 255);
        this.f41428G = Color.argb(179, 0, 0, 0);
        this.f41429H = (int) TypedValue.applyDimension(1, 62.0f, displayMetrics);
        this.f41430I = (int) TypedValue.applyDimension(1, 62.0f, displayMetrics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f41431p.ordinal());
        parcel.writeFloat(this.f41432q);
        parcel.writeFloat(this.f41433r);
        parcel.writeInt(this.f41434s.ordinal());
        parcel.writeByte(this.f41435t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41436u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f41437v);
        parcel.writeByte(this.f41438w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f41439x);
        parcel.writeInt(this.f41440y);
        parcel.writeFloat(this.f41441z);
        parcel.writeInt(this.f41422A);
        parcel.writeFloat(this.f41423B);
        parcel.writeFloat(this.f41424C);
        parcel.writeInt(this.f41425D);
        parcel.writeFloat(this.f41426E);
        parcel.writeInt(this.f41427F);
        parcel.writeInt(this.f41428G);
        parcel.writeInt(this.f41429H);
        parcel.writeInt(this.f41430I);
    }

    protected CropImageOptions(Parcel parcel) {
        this.f41431p = CropOverlayView.EnumC7713b.values()[parcel.readInt()];
        this.f41432q = parcel.readFloat();
        this.f41433r = parcel.readFloat();
        this.f41434s = CropOverlayView.EnumC7714c.values()[parcel.readInt()];
        this.f41435t = parcel.readByte() != 0;
        this.f41436u = parcel.readByte() != 0;
        this.f41437v = parcel.readInt();
        this.f41438w = parcel.readByte() != 0;
        this.f41439x = parcel.readInt();
        this.f41440y = parcel.readInt();
        this.f41441z = parcel.readFloat();
        this.f41422A = parcel.readInt();
        this.f41423B = parcel.readFloat();
        this.f41424C = parcel.readFloat();
        this.f41425D = parcel.readInt();
        this.f41426E = parcel.readFloat();
        this.f41427F = parcel.readInt();
        this.f41428G = parcel.readInt();
        this.f41429H = parcel.readInt();
        this.f41430I = parcel.readInt();
    }
}
