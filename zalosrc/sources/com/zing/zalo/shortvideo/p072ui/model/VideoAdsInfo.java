package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoAdsInfo implements Parcelable {

    /* renamed from: A */
    private final String f51420A;

    /* renamed from: B */
    private final List f51421B;

    /* renamed from: p */
    private final int f51422p;

    /* renamed from: q */
    private final int f51423q;

    /* renamed from: r */
    private final int f51424r;

    /* renamed from: s */
    private final String f51425s;

    /* renamed from: t */
    private final String f51426t;

    /* renamed from: u */
    private final Tag f51427u;

    /* renamed from: v */
    private final long f51428v;

    /* renamed from: w */
    private final Action f51429w;

    /* renamed from: x */
    private final Action f51430x;

    /* renamed from: y */
    private final Ended f51431y;

    /* renamed from: z */
    private final String f51432z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoAdsInfo> CREATOR = new C9779a();

    /* renamed from: C */
    private static final KSerializer[] f51419C = {null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE)};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoAdsInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.VideoAdsInfo$a */
    /* loaded from: classes5.dex */
    public static final class C9779a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final VideoAdsInfo createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Tag createFromParcel = Tag.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            Action createFromParcel2 = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            Action createFromParcel3 = Action.CREATOR.createFromParcel(parcel);
            Ended createFromParcel4 = parcel.readInt() == 0 ? null : Ended.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = readString4;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                str = readString4;
                int i11 = 0;
                while (i11 != readInt4) {
                    arrayList2.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt4 = readInt4;
                }
                arrayList = arrayList2;
            }
            return new VideoAdsInfo(readInt, readInt2, readInt3, readString, readString2, createFromParcel, readLong, createFromParcel2, createFromParcel3, createFromParcel4, readString3, str, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final VideoAdsInfo[] newArray(int i11) {
            return new VideoAdsInfo[i11];
        }
    }

    public /* synthetic */ VideoAdsInfo(int i11, int i12, int i13, int i14, String str, String str2, Tag tag, long j11, Action action, Action action2, Ended ended, String str3, String str4, List list, AbstractC26805k1 abstractC26805k1) {
        if (8191 != (i11 & 8191)) {
            AbstractC26774a1.m137800b(i11, 8191, VideoAdsInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f51422p = i12;
        this.f51423q = i13;
        this.f51424r = i14;
        this.f51425s = str;
        this.f51426t = str2;
        this.f51427u = tag;
        this.f51428v = j11;
        this.f51429w = action;
        this.f51430x = action2;
        this.f51431y = ended;
        this.f51432z = str3;
        this.f51420A = str4;
        this.f51421B = list;
    }

    /* renamed from: o */
    public static final /* synthetic */ void m52925o(VideoAdsInfo videoAdsInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f51419C;
        interfaceC21886d.mo114033x(serialDescriptor, 0, videoAdsInfo.f51422p);
        interfaceC21886d.mo114033x(serialDescriptor, 1, videoAdsInfo.f51423q);
        interfaceC21886d.mo114033x(serialDescriptor, 2, videoAdsInfo.f51424r);
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, videoAdsInfo.f51425s);
        interfaceC21886d.mo114028h(serialDescriptor, 4, c26814n1, videoAdsInfo.f51426t);
        interfaceC21886d.mo114029i(serialDescriptor, 5, Tag$$serializer.INSTANCE, videoAdsInfo.f51427u);
        interfaceC21886d.mo114022E(serialDescriptor, 6, videoAdsInfo.f51428v);
        Action$$serializer action$$serializer = Action$$serializer.INSTANCE;
        interfaceC21886d.mo114028h(serialDescriptor, 7, action$$serializer, videoAdsInfo.f51429w);
        interfaceC21886d.mo114029i(serialDescriptor, 8, action$$serializer, videoAdsInfo.f51430x);
        interfaceC21886d.mo114028h(serialDescriptor, 9, Ended$$serializer.INSTANCE, videoAdsInfo.f51431y);
        interfaceC21886d.mo114028h(serialDescriptor, 10, c26814n1, videoAdsInfo.f51432z);
        interfaceC21886d.mo114028h(serialDescriptor, 11, c26814n1, videoAdsInfo.f51420A);
        interfaceC21886d.mo114028h(serialDescriptor, 12, kSerializerArr[12], videoAdsInfo.f51421B);
    }

    /* renamed from: b */
    public final Action m52926b() {
        return this.f51430x;
    }

    /* renamed from: c */
    public final Action m52927c() {
        return this.f51429w;
    }

    /* renamed from: d */
    public final String m52928d() {
        return this.f51425s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m52929e() {
        return this.f51426t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdsInfo)) {
            return false;
        }
        VideoAdsInfo videoAdsInfo = (VideoAdsInfo) obj;
        return this.f51422p == videoAdsInfo.f51422p && this.f51423q == videoAdsInfo.f51423q && this.f51424r == videoAdsInfo.f51424r && AbstractC19074t.m100204b(this.f51425s, videoAdsInfo.f51425s) && AbstractC19074t.m100204b(this.f51426t, videoAdsInfo.f51426t) && AbstractC19074t.m100204b(this.f51427u, videoAdsInfo.f51427u) && this.f51428v == videoAdsInfo.f51428v && AbstractC19074t.m100204b(this.f51429w, videoAdsInfo.f51429w) && AbstractC19074t.m100204b(this.f51430x, videoAdsInfo.f51430x) && AbstractC19074t.m100204b(this.f51431y, videoAdsInfo.f51431y) && AbstractC19074t.m100204b(this.f51432z, videoAdsInfo.f51432z) && AbstractC19074t.m100204b(this.f51420A, videoAdsInfo.f51420A) && AbstractC19074t.m100204b(this.f51421B, videoAdsInfo.f51421B);
    }

    /* renamed from: f */
    public final int m52930f() {
        return this.f51423q;
    }

    /* renamed from: g */
    public final List m52931g() {
        return this.f51421B;
    }

    /* renamed from: h */
    public final Ended m52932h() {
        return this.f51431y;
    }

    public int hashCode() {
        int i11 = ((((this.f51422p * 31) + this.f51423q) * 31) + this.f51424r) * 31;
        String str = this.f51425s;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51426t;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f51427u.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f51428v)) * 31;
        Action action = this.f51429w;
        int hashCode3 = (((hashCode2 + (action == null ? 0 : action.hashCode())) * 31) + this.f51430x.hashCode()) * 31;
        Ended ended = this.f51431y;
        int hashCode4 = (hashCode3 + (ended == null ? 0 : ended.hashCode())) * 31;
        String str3 = this.f51432z;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51420A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f51421B;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i */
    public final int m52933i() {
        return this.f51422p;
    }

    public final boolean isValid() {
        int i11 = this.f51423q;
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: j */
    public final String m52934j() {
        return this.f51420A;
    }

    /* renamed from: k */
    public final String m52935k() {
        return this.f51432z;
    }

    /* renamed from: l */
    public final Tag m52936l() {
        return this.f51427u;
    }

    /* renamed from: m */
    public final int m52937m() {
        return this.f51424r;
    }

    /* renamed from: n */
    public final long m52938n() {
        return this.f51428v;
    }

    public String toString() {
        return "VideoAdsInfo(index=" + this.f51422p + ", adsType=" + this.f51423q + ", templateId=" + this.f51424r + ", adId=" + this.f51425s + ", adSrc=" + this.f51426t + ", tag=" + this.f51427u + ", watchTimeChangeAction=" + this.f51428v + ", actionBefore=" + this.f51429w + ", actionAfter=" + this.f51430x + ", ended=" + this.f51431y + ", shareUrl=" + this.f51432z + ", reportUrl=" + this.f51420A + ", btSheet=" + this.f51421B + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f51422p);
        parcel.writeInt(this.f51423q);
        parcel.writeInt(this.f51424r);
        parcel.writeString(this.f51425s);
        parcel.writeString(this.f51426t);
        this.f51427u.writeToParcel(parcel, i11);
        parcel.writeLong(this.f51428v);
        Action action = this.f51429w;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i11);
        }
        this.f51430x.writeToParcel(parcel, i11);
        Ended ended = this.f51431y;
        if (ended == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ended.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f51432z);
        parcel.writeString(this.f51420A);
        List list = this.f51421B;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BottomSheetItem) it.next()).writeToParcel(parcel, i11);
        }
    }

    public VideoAdsInfo(int i11, int i12, int i13, String str, String str2, Tag tag, long j11, Action action, Action action2, Ended ended, String str3, String str4, List list) {
        AbstractC19074t.m100208f(tag, "tag");
        AbstractC19074t.m100208f(action2, "actionAfter");
        this.f51422p = i11;
        this.f51423q = i12;
        this.f51424r = i13;
        this.f51425s = str;
        this.f51426t = str2;
        this.f51427u = tag;
        this.f51428v = j11;
        this.f51429w = action;
        this.f51430x = action2;
        this.f51431y = ended;
        this.f51432z = str3;
        this.f51420A = str4;
        this.f51421B = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoAdsInfo(VideoAdsData videoAdsData) {
        this(videoAdsData.m51270i(), videoAdsData.m51267f(), videoAdsData.m51274m(), videoAdsData.m51265d(), videoAdsData.m51266e(), videoAdsData.m51273l(), videoAdsData.m51276o(), videoAdsData.m51264c(), videoAdsData.m51263b(), videoAdsData.m51269h(), videoAdsData.m51272k(), videoAdsData.m51271j(), videoAdsData.m51268g());
        AbstractC19074t.m100208f(videoAdsData, "videoAds");
    }
}
