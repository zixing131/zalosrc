package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RichTextFormat implements Parcelable {
    public static final Parcelable.Creator<RichTextFormat> CREATOR = new C7891a();

    /* renamed from: p */
    private List f42676p;

    /* renamed from: q */
    private int f42677q;

    /* renamed from: r */
    private int f42678r;

    /* renamed from: s */
    private int f42679s;

    /* renamed from: t */
    private int f42680t;

    /* renamed from: com.zing.zalo.control.RichTextFormat$a */
    /* loaded from: classes3.dex */
    class C7891a implements Parcelable.Creator {
        C7891a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RichTextFormat createFromParcel(Parcel parcel) {
            return new RichTextFormat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RichTextFormat[] newArray(int i11) {
            return new RichTextFormat[i11];
        }
    }

    protected RichTextFormat(Parcel parcel) {
        this.f42676p = parcel.createTypedArrayList(TextStyle.CREATOR);
        this.f42677q = parcel.readInt();
        this.f42678r = parcel.readInt();
    }

    /* renamed from: g */
    public static final RichTextFormat m40644g(JSONObject jSONObject) {
        String[] split;
        if (jSONObject == null) {
            return null;
        }
        try {
            int i11 = jSONObject.getInt("start");
            int i12 = jSONObject.getInt("len") + i11;
            String optString = jSONObject.optString("st");
            if (!TextUtils.isEmpty(optString) && (split = optString.split(",")) != null && split.length > 0) {
                int length = split.length;
                LinkedList linkedList = new LinkedList();
                for (int i13 = length - 1; i13 >= 0; i13--) {
                    TextStyle m40657f = TextStyle.m40657f(split[i13].trim());
                    if (m40657f != null) {
                        linkedList.add(m40657f);
                    }
                }
                if (i11 >= 0 && i12 >= 0 && !linkedList.isEmpty()) {
                    return new RichTextFormat(linkedList, i11, i12);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.zing.zalo.control.TextStyle] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* renamed from: a */
    public CharSequence m40645a(CharSequence charSequence, int i11) {
        List list;
        if (!TextUtils.isEmpty(charSequence) && m40650f() < i11 && (list = this.f42676p) != null && !list.isEmpty() && m40650f() < m40648d()) {
            if (charSequence instanceof Spannable) {
                charSequence = (Spannable) charSequence;
            } else {
                charSequence = new SpannableStringBuilder(charSequence);
            }
            Iterator it = this.f42676p.iterator();
            while (it.hasNext()) {
                ((TextStyle) it.next()).m40658a(charSequence, m40650f(), Math.min(m40648d(), i11));
            }
        }
        return charSequence;
    }

    /* renamed from: b */
    public int m40646b() {
        return this.f42680t;
    }

    /* renamed from: c */
    public int m40647c() {
        return this.f42679s;
    }

    /* renamed from: d */
    public int m40648d() {
        return this.f42678r + this.f42680t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public TextStyle m40649e() {
        for (TextStyle textStyle : this.f42676p) {
            if (textStyle.m40659d() == 9) {
                return textStyle;
            }
        }
        return null;
    }

    /* renamed from: f */
    public int m40650f() {
        return this.f42677q + this.f42679s;
    }

    /* renamed from: h */
    public void m40651h(int i11) {
        this.f42680t = i11;
    }

    /* renamed from: i */
    public void m40652i(int i11) {
        this.f42679s = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedList(this.f42676p);
        parcel.writeInt(this.f42677q);
        parcel.writeInt(this.f42678r);
    }

    public RichTextFormat(List list, int i11, int i12) {
        this.f42677q = i11;
        this.f42678r = i12;
        this.f42676p = list;
    }
}
