package com.example.poyectofinal.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.poyectofinal.R;
import com.example.poyectofinal.model.Articles;

import org.w3c.dom.Text;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {
    private List<Articles> articles;
    private Context context;

    public ArticlesAdapter(List<Articles> articles, Context context) {
        this.articles = articles;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.articles_items, parent, false);

        // Aquí se configura la altura y el ancho de cada elemento para que se muestren uno sobre otro
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        view.setLayoutParams(layoutParams);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitulo.setText(articles.get(position).getTittle());
        holder.txtArtp1.setText(articles.get(position).getParagraphOne());
        holder.txtAu.setText(articles.get(position).getFooter());
        Glide.with(context)
                .load(articles.get(position).getImgUrl())
                .apply(new RequestOptions()
                        .placeholder(R.drawable.side_nav_bar) // Imagen de placeholder mientras se carga
                        .error(R.drawable.side_nav_bar)) // Imagen de error en caso de fallo de carga
                .into(holder.imgPortada);

    }


    @Override
    public int getItemCount() {
        return articles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPortada;
        private TextView txtTitulo;
        private TextView txtArtp1;
        private TextView txtAu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPortada = itemView.findViewById(R.id.imgArt);
            txtTitulo = itemView.findViewById(R.id.titleArt);
            txtArtp1 = itemView.findViewById(R.id.txtArtP1);
            txtAu = itemView.findViewById(R.id.txtArtAu);
        }
    }
}
