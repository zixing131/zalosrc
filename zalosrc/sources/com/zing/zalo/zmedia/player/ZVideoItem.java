package com.zing.zalo.zmedia.player;

/* loaded from: classes7.dex */
public class ZVideoItem {
    public String cachePath;
    public String h264HlsUri;
    public String hevcMp4Uri;

    /* renamed from: id */
    public String f88144id;
    public int index;
    public String mediaId;
    public int priority;
    public int source;
    public String userId;

    public ZVideoItem(String str, String str2, int i11, int i12) {
        this.priority = 0;
        this.userId = "";
        this.cachePath = "";
        this.h264HlsUri = str == null ? "" : str;
        this.hevcMp4Uri = str2 == null ? "" : str2;
        this.index = i11;
        this.source = i12;
    }

    public ZVideoItem(String str, String str2, String str3, int i11, int i12, int i13) {
        this.priority = 0;
        this.userId = "";
        this.cachePath = "";
        this.h264HlsUri = str == null ? "" : str;
        this.hevcMp4Uri = str2 == null ? "" : str2;
        this.userId = str3;
        this.index = i11;
        this.source = i12;
        this.priority = i13;
    }
}
