package no;

import android.content.Intent;
import com.zing.zalo.control.ItemAlbumMobile;

/* renamed from: no.h */
/* loaded from: classes4.dex */
public class C23915h {

    /* renamed from: a */
    public Intent f115575a;

    /* renamed from: b */
    public ItemAlbumMobile f115576b;

    /* renamed from: c */
    public boolean f115577c;

    /* renamed from: d */
    public boolean f115578d;

    /* renamed from: e */
    public boolean f115579e;

    private C23915h(Intent intent, ItemAlbumMobile itemAlbumMobile, boolean z11, boolean z12, boolean z13) {
        this.f115575a = intent;
        this.f115576b = itemAlbumMobile;
        this.f115577c = z11;
        this.f115578d = z12;
        this.f115579e = z13;
    }

    /* renamed from: a */
    public static C23915h m125042a(Intent intent) {
        ItemAlbumMobile itemAlbumMobile = null;
        if (intent == null || intent.getExtras() == null) {
            return null;
        }
        if (intent.hasExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE")) {
            itemAlbumMobile = (ItemAlbumMobile) intent.getExtras().getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
        }
        return new C23915h(intent, itemAlbumMobile, intent.getExtras().getBoolean("EXTRA_BOOL_FEED_DELETED"), intent.hasExtra("extra_feed_like_status"), intent.getBooleanExtra("EXTRA_SHOULD_REFRESH_TIMELINE", false));
    }
}
