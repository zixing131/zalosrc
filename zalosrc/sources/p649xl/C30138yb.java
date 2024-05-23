package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.yb */
/* loaded from: classes3.dex */
public final class C30138yb implements InterfaceC22715a {

    /* renamed from: A */
    public final ListItemSetting f140034A;

    /* renamed from: B */
    public final ListItemSetting f140035B;

    /* renamed from: C */
    public final ListItemSetting f140036C;

    /* renamed from: D */
    public final ListItemSetting f140037D;

    /* renamed from: p */
    private final View f140038p;

    /* renamed from: q */
    public final ListItemSetting f140039q;

    /* renamed from: r */
    public final ListItemSetting f140040r;

    /* renamed from: s */
    public final ListItemSetting f140041s;

    /* renamed from: t */
    public final ListItemSetting f140042t;

    /* renamed from: u */
    public final ListItemSetting f140043u;

    /* renamed from: v */
    public final ListItemSetting f140044v;

    /* renamed from: w */
    public final ListItemSetting f140045w;

    /* renamed from: x */
    public final ListItemSetting f140046x;

    /* renamed from: y */
    public final ListItemSetting f140047y;

    /* renamed from: z */
    public final ListItemSetting f140048z;

    private C30138yb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9, ListItemSetting listItemSetting10, ListItemSetting listItemSetting11, ListItemSetting listItemSetting12, ListItemSetting listItemSetting13, ListItemSetting listItemSetting14) {
        this.f140038p = view;
        this.f140039q = listItemSetting;
        this.f140040r = listItemSetting2;
        this.f140041s = listItemSetting3;
        this.f140042t = listItemSetting4;
        this.f140043u = listItemSetting5;
        this.f140044v = listItemSetting6;
        this.f140045w = listItemSetting7;
        this.f140046x = listItemSetting8;
        this.f140047y = listItemSetting9;
        this.f140048z = listItemSetting10;
        this.f140034A = listItemSetting11;
        this.f140035B = listItemSetting12;
        this.f140036C = listItemSetting13;
        this.f140037D = listItemSetting14;
    }

    /* renamed from: a */
    public static C30138yb m148745a(View view) {
        int i11 = AbstractC6918a0.itemAutoPlayAudio;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAutoPlayVideo;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemBlockMsg;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemBubbleChat;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemChatLabel;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemDisplayMsg;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemEnterSendMsg;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.itemFloatingEmoji;
                                    ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting8 != null) {
                                        i11 = AbstractC6918a0.itemHiddenChat;
                                        ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting9 != null) {
                                            i11 = AbstractC6918a0.itemPhotoHd;
                                            ListItemSetting listItemSetting10 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                            if (listItemSetting10 != null) {
                                                i11 = AbstractC6918a0.itemPreDownload;
                                                ListItemSetting listItemSetting11 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                if (listItemSetting11 != null) {
                                                    i11 = AbstractC6918a0.itemQuickMsg;
                                                    ListItemSetting listItemSetting12 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                    if (listItemSetting12 != null) {
                                                        i11 = AbstractC6918a0.itemSuggestNewPhoto;
                                                        ListItemSetting listItemSetting13 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                        if (listItemSetting13 != null) {
                                                            i11 = AbstractC6918a0.itemSuggestSticker;
                                                            ListItemSetting listItemSetting14 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                            if (listItemSetting14 != null) {
                                                                return new C30138yb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, listItemSetting9, listItemSetting10, listItemSetting11, listItemSetting12, listItemSetting13, listItemSetting14);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30138yb m148746b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_message_v2_view, viewGroup);
            return m148745a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f140038p;
    }
}
