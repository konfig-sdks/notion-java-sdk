package com.konfigthis.client;

import com.konfigthis.client.api.BlockApi;
import com.konfigthis.client.api.CommentApi;
import com.konfigthis.client.api.DatabaseApi;
import com.konfigthis.client.api.PageApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.UserApi;

public class Notion {
    private ApiClient apiClient;
    public final BlockApi block;
    public final CommentApi comment;
    public final DatabaseApi database;
    public final PageApi page;
    public final SearchApi search;
    public final TokenApi token;
    public final UserApi user;

    public Notion() {
        this(null);
    }

    public Notion(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.block = new BlockApi(this.apiClient);
        this.comment = new CommentApi(this.apiClient);
        this.database = new DatabaseApi(this.apiClient);
        this.page = new PageApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
    }

}
