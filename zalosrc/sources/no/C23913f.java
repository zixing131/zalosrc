package no;

import android.content.Intent;
import com.zing.zalo.control.ItemAlbumMobile;
import java.util.ArrayList;

/* renamed from: no.f */
/* loaded from: classes4.dex */
public class C23913f {

    /* renamed from: a */
    public Intent f115565a;

    /* renamed from: b */
    public ArrayList f115566b;

    /* renamed from: c */
    public boolean f115567c;

    /* renamed from: d */
    public boolean f115568d;

    /* renamed from: e */
    public boolean f115569e;

    /* renamed from: f */
    public ItemAlbumMobile f115570f;

    /* renamed from: g */
    public boolean f115571g;

    private C23913f(Intent intent, ArrayList arrayList, boolean z11, boolean z12, boolean z13, ItemAlbumMobile itemAlbumMobile, boolean z14) {
        this.f115565a = intent;
        this.f115566b = arrayList;
        this.f115567c = z11;
        this.f115568d = z12;
        this.f115569e = z13;
        this.f115570f = itemAlbumMobile;
        this.f115571g = z14;
    }

    /* renamed from: a */
    public static C23913f m125040a(Intent intent) {
        ItemAlbumMobile itemAlbumMobile = null;
        if (intent == null) {
            return null;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("deletedPhoto");
        boolean hasExtra = intent.hasExtra("extra_deleted_tag_uids");
        boolean hasExtra2 = intent.hasExtra("extra_feed_empty_tag");
        boolean hasExtra3 = intent.hasExtra("extra_feed_like_status");
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_SHOULD_REFRESH_TIMELINE", false);
        if (intent.hasExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE")) {
            itemAlbumMobile = (ItemAlbumMobile) intent.getParcelableExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
        }
        return new C23913f(intent, stringArrayListExtra, hasExtra, hasExtra2, hasExtra3, itemAlbumMobile, booleanExtra);
    }
}
