package mo;

import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.social.controls.FeedLikeStatus;

/* renamed from: mo.m0 */
/* loaded from: classes4.dex */
public class C23396m0 {

    /* renamed from: a */
    public ItemAlbumMobile f113654a;

    /* renamed from: b */
    public String f113655b;

    /* renamed from: c */
    public boolean f113656c;

    /* renamed from: d */
    public FeedLikeStatus f113657d;

    private C23396m0(ItemAlbumMobile itemAlbumMobile, String str, boolean z11, FeedLikeStatus feedLikeStatus) {
        this.f113654a = itemAlbumMobile;
        this.f113655b = str;
        this.f113656c = z11;
        this.f113657d = feedLikeStatus;
    }

    /* renamed from: a */
    public static C23396m0 m122887a(ItemAlbumMobile itemAlbumMobile, String str, boolean z11, FeedLikeStatus feedLikeStatus) {
        if (itemAlbumMobile != null) {
            return new C23396m0(itemAlbumMobile, itemAlbumMobile.f42595r, z11, feedLikeStatus);
        }
        return new C23396m0(null, str, z11, feedLikeStatus);
    }
}
