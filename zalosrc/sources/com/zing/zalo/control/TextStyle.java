package com.zing.zalo.control;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.zing.zalo.p077ui.widget.C13778s1;
import me0.AbstractC23136l9;
import nb0.C23673d;
import nb0.C23674e;
import p148f3.C18710b;
import p148f3.C18711c;
import p227i3.C20215s;
import p227i3.C20217u;

/* loaded from: classes3.dex */
public class TextStyle implements Parcelable {
    public static final Parcelable.Creator<TextStyle> CREATOR = new C7892a();

    /* renamed from: p */
    private int f42681p;

    /* renamed from: q */
    private int f42682q;

    /* renamed from: com.zing.zalo.control.TextStyle$a */
    /* loaded from: classes3.dex */
    class C7892a implements Parcelable.Creator {
        C7892a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextStyle createFromParcel(Parcel parcel) {
            return new TextStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextStyle[] newArray(int i11) {
            return new TextStyle[i11];
        }
    }

    public TextStyle(int i11, int i12) {
        this.f42681p = i11;
        this.f42682q = i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private Object m40655b() {
        if (this.f42681p == 0 || !m40660e()) {
            return null;
        }
        switch (this.f42681p) {
            case 1:
                return new StyleSpan(1);
            case 2:
                return new StyleSpan(2);
            case 3:
                return new UnderlineSpan();
            case 4:
                return new StrikethroughSpan();
            case 5:
                if (this.f42682q > 0) {
                    return new AbsoluteSizeSpan(m40656c(this.f42682q));
                }
                return null;
            case 6:
                if (this.f42682q != 0) {
                    return new ForegroundColorSpan(this.f42682q);
                }
                return null;
            case 7:
                if (this.f42682q > 0) {
                    return new LeadingMarginSpan.Standard(AbstractC23136l9.m118742r(this.f42682q), 0);
                }
                return null;
            case 8:
                return new C23673d();
            case 9:
                return new C23674e(this.f42682q);
            default:
                return null;
        }
    }

    /* renamed from: c */
    private int m40656c(int i11) {
        boolean m76966g = C13778s1.m76966g();
        int m118742r = AbstractC23136l9.m118742r(i11);
        if (m76966g) {
            return (int) (m118742r * C13778s1.m76962c());
        }
        return m118742r;
    }

    /* renamed from: f */
    public static TextStyle m40657f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split("_");
            if (split.length > 0) {
                if (TextUtils.equals(split[0], C18710b.f94009e)) {
                    return new TextStyle(1);
                }
                if (TextUtils.equals(split[0], "i")) {
                    return new TextStyle(2);
                }
                if (TextUtils.equals(split[0], C20217u.f99970o)) {
                    return new TextStyle(3);
                }
                if (TextUtils.equals(split[0], C20215s.f99966b)) {
                    return new TextStyle(4);
                }
                if (TextUtils.equals(split[0], "f")) {
                    if (split.length > 1) {
                        return new TextStyle(5, Integer.parseInt(split[1]));
                    }
                } else if (TextUtils.equals(split[0], C18711c.f94014e)) {
                    if (split.length > 1) {
                        return new TextStyle(6, Color.parseColor('#' + split[1]));
                    }
                } else if (TextUtils.equals(split[0], "ind")) {
                    if (split.length > 1) {
                        return new TextStyle(7, Integer.parseInt(split[1]));
                    }
                } else if (TextUtils.equals(split[0], "lst") && split.length > 1) {
                    int parseInt = Integer.parseInt(split[1]);
                    if (parseInt == 1) {
                        return new TextStyle(8);
                    }
                    if (parseInt == 2) {
                        return new TextStyle(9);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public void m40658a(Spannable spannable, int i11, int i12) {
        try {
            Object m40655b = m40655b();
            if (m40655b != null) {
                spannable.setSpan(m40655b, i11, i12, 33);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public int m40659d() {
        return this.f42681p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m40660e() {
        switch (this.f42681p) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: g */
    public void m40661g(int i11) {
        this.f42682q = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42681p);
        parcel.writeInt(this.f42682q);
    }

    public TextStyle(int i11) {
        this.f42681p = i11;
    }

    protected TextStyle(Parcel parcel) {
        this.f42681p = parcel.readInt();
        this.f42682q = parcel.readInt();
    }
}
