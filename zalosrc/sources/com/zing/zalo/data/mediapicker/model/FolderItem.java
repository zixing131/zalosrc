package com.zing.zalo.data.mediapicker.model;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FolderItem extends MediaItem {

    /* renamed from: i0 */
    private List f42925i0;

    /* renamed from: j0 */
    private long f42926j0;

    /* renamed from: k0 */
    private String f42927k0;

    public FolderItem() {
        this.f42925i0 = new ArrayList();
        this.f42927k0 = "";
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: F0 */
    public void mo41080F0(long j11) {
        this.f42926j0 = j11;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: Q */
    public String mo41081Q() {
        return ((MediaItem) this.f42925i0.get(0)).mo41081Q();
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: W0 */
    public void mo41082W0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42927k0 = str;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: a0 */
    public String mo41083a0() {
        return ((MediaItem) this.f42925i0.get(0)).mo41083a0();
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem, java.lang.Comparable
    /* renamed from: j */
    public int compareTo(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "other");
        return AbstractC19074t.m100210h(mediaItem.m41097D(), m41097D());
    }

    /* renamed from: s1 */
    public final void m41085s1(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "item");
        if (mediaItem.mo41081Q().length() == 0) {
            return;
        }
        this.f42925i0.add(mediaItem);
        mediaItem.m41128V0(this);
        m41107J0(mediaItem.m41097D());
    }

    /* renamed from: t1 */
    public final List m41086t1() {
        return this.f42925i0;
    }

    /* renamed from: u1 */
    public final String m41087u1() {
        return m41172u();
    }

    /* renamed from: v1 */
    public final int m41088v1() {
        return this.f42925i0.size();
    }

    /* renamed from: w1 */
    public final void m41089w1(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f42925i0 = list;
    }

    @Override // com.zing.zalo.data.mediapicker.model.MediaItem
    /* renamed from: x */
    public long mo41090x() {
        return ((MediaItem) this.f42925i0.get(0)).mo41090x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FolderItem(MediaItem mediaItem, String str) {
        this();
        AbstractC19074t.m100208f(mediaItem, "item");
        m41085s1(mediaItem);
        m41098D0(str == null ? "" : str);
    }
}
