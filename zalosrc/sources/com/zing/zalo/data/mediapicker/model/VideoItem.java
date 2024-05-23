package com.zing.zalo.data.mediapicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.Serializable;
import java.net.URLEncoder;
import me0.AbstractC23041d2;

/* loaded from: classes3.dex */
public final class VideoItem extends MediaItem {

    /* renamed from: i0 */
    private int f42985i0;

    /* renamed from: j0 */
    private long f42986j0;

    /* renamed from: k0 */
    private String f42987k0;

    /* renamed from: l0 */
    private boolean f42988l0;

    /* renamed from: m0 */
    private boolean f42989m0;

    /* renamed from: n0 */
    private boolean f42990n0;

    /* renamed from: o0 */
    private int f42991o0;

    /* renamed from: p0 */
    private Serializable f42992p0;
    public static final C7948b Companion = new C7948b(null);
    public static final Parcelable.Creator<VideoItem> CREATOR = new C7947a();

    /* renamed from: com.zing.zalo.data.mediapicker.model.VideoItem$a */
    /* loaded from: classes3.dex */
    public static final class C7947a implements Parcelable.Creator {
        C7947a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "in");
            return new VideoItem(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public VideoItem[] newArray(int i11) {
            return new VideoItem[i11];
        }
    }

    /* renamed from: com.zing.zalo.data.mediapicker.model.VideoItem$b */
    /* loaded from: classes3.dex */
    public static final class C7948b {
        private C7948b() {
        }

        public /* synthetic */ C7948b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public /* synthetic */ VideoItem(Parcel parcel, AbstractC19060k abstractC19060k) {
        this(parcel);
    }

    /* renamed from: H1 */
    private final void m41204H1(MediaItem mediaItem) {
        if (mediaItem instanceof VideoItem) {
            VideoItem videoItem = (VideoItem) mediaItem;
            this.f42987k0 = videoItem.f42987k0;
            this.f42992p0 = videoItem.f42992p0;
            this.f42988l0 = videoItem.f42988l0;
            this.f42989m0 = videoItem.f42989m0;
            this.f42990n0 = videoItem.f42990n0;
            this.f42985i0 = videoItem.f42985i0;
        }
    }

    /* renamed from: A1 */
    public final boolean m41205A1() {
        return this.f42988l0;
    }

    /* renamed from: B1 */
    public final void m41206B1(boolean z11) {
        this.f42990n0 = z11;
    }

    /* renamed from: C1 */
    public final void m41207C1(long j11) {
        this.f42986j0 = j11;
    }

    /* renamed from: D1 */
    public final void m41208D1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42987k0 = str;
    }

    /* renamed from: E1 */
    public final void m41209E1(boolean z11) {
        this.f42989m0 = z11;
    }

    /* renamed from: F1 */
    public final void m41210F1(boolean z11) {
        this.f42988l0 = z11;
    }

    /* renamed from: G1 */
    public final void m41211G1(Serializable serializable) {
        this.f42992p0 = serializable;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: a0 */
    public String mo41083a0() {
        String mo41081Q = mo41081Q();
        try {
            String encode = URLEncoder.encode(mo41081Q, "UTF-8");
            AbstractC19074t.m100207e(encode, "encode(...)");
            mo41081Q = encode;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return "content://id=" + mo41090x() + "&data=" + mo41081Q + "&date=" + m41097D() + "&type=video";
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: l0 */
    public boolean mo41154l0() {
        return this.f42992p0 != null || this.f42988l0;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: q1 */
    public void mo41167q1(MediaItem mediaItem) {
        super.mo41167q1(mediaItem);
        m41204H1(mediaItem);
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: r1 */
    public void mo41169r1(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "srcItem");
        super.mo41169r1(mediaItem);
        m41204H1(mediaItem);
    }

    /* renamed from: s1 */
    public final String m41212s1() {
        if (this.f42987k0.length() > 0 && AbstractC23041d2.m118194A(this.f42987k0)) {
            return this.f42987k0;
        }
        return m41215v1();
    }

    /* renamed from: t1 */
    public final long m41213t1() {
        return this.f42986j0;
    }

    /* renamed from: u1 */
    public final String m41214u1() {
        return this.f42987k0;
    }

    /* renamed from: v1 */
    public final String m41215v1() {
        if (mo41081Q().length() > 0) {
            return mo41083a0();
        }
        return m41134Z();
    }

    /* renamed from: w1 */
    public final int m41216w1() {
        return this.f42991o0;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        super.writeToParcel(parcel, i11);
        parcel.writeLong(this.f42986j0);
        parcel.writeString(this.f42987k0);
        parcel.writeSerializable(this.f42992p0);
        parcel.writeInt(this.f42988l0 ? 1 : 0);
        parcel.writeInt(this.f42989m0 ? 1 : 0);
        parcel.writeInt(this.f42990n0 ? 1 : 0);
        parcel.writeInt(this.f42985i0);
        parcel.writeInt(this.f42991o0);
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: x0 */
    public void mo41176x0() {
        super.mo41176x0();
        this.f42992p0 = null;
        this.f42987k0 = "";
        this.f42988l0 = false;
        this.f42989m0 = false;
        this.f42990n0 = false;
        this.f42985i0 = 0;
    }

    /* renamed from: x1 */
    public final Serializable m41217x1() {
        return this.f42992p0;
    }

    /* renamed from: y1 */
    public final boolean m41218y1() {
        return this.f42990n0;
    }

    /* renamed from: z1 */
    public final boolean m41219z1() {
        return this.f42989m0;
    }

    public VideoItem() {
        this.f42987k0 = "";
    }

    private VideoItem(Parcel parcel) {
        super(parcel);
        String str = "";
        this.f42987k0 = "";
        this.f42986j0 = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null) {
            AbstractC19074t.m100205c(readString);
            str = readString;
        }
        this.f42987k0 = str;
        this.f42992p0 = parcel.readSerializable();
        this.f42988l0 = parcel.readInt() == 1;
        this.f42989m0 = parcel.readInt() == 1;
        this.f42990n0 = parcel.readInt() == 1;
        this.f42985i0 = parcel.readInt();
        this.f42991o0 = parcel.readInt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoItem(VideoItem videoItem) {
        super(videoItem);
        AbstractC19074t.m100208f(videoItem, "videoItem");
        this.f42987k0 = "";
        this.f42986j0 = videoItem.f42986j0;
        this.f42987k0 = videoItem.f42987k0;
        this.f42988l0 = videoItem.f42988l0;
        this.f42989m0 = videoItem.f42989m0;
        this.f42990n0 = videoItem.f42990n0;
        this.f42985i0 = videoItem.f42985i0;
        this.f42991o0 = videoItem.f42991o0;
        this.f42992p0 = videoItem.f42992p0;
    }
}
